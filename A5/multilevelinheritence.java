package A5;

import java.util.*;
import javax.swing.JOptionPane;
import java.io.PrintWriter; //write file
import java.io.FileWriter;
import java.io.IOException;

class Subject {
    Scanner sc= new Scanner (System.in);
    String Subject;
    String SubjectCode;

    void subjectRegister (){
        System.out.println("\n==ABOUT SUBJECT==");
        System.out.println("Name of the subject: ");
        Subject= sc.nextLine();
        System.out.println("Enter code of the subject:");
        SubjectCode= sc.nextLine();
    }
}

class Marks extends Subject {
    Scanner sc= new Scanner(System.in);
    double[] Marks= new double[3];
    double totalMarks;

    void calculateMarks(){
        System.out.println("\n==CALCULATE 3 MARKS==");
        for (int i=0; i<3; i++) {
        System.out.println("Enter marks " + (i+1) + " for " + Subject + ": ");
        Marks[i]= sc.nextDouble();
        totalMarks += Marks[i];
        }

    }
}

class Grade extends Marks {
    String Grade;

    void calculateGrade() {
        if (totalMarks >= 80 && totalMarks <= 100) {
            Grade = "A";
        } else if (totalMarks >= 70 && totalMarks <= 79) {
            Grade = "B";
        } else if (totalMarks >= 60 && totalMarks <= 69) {
            Grade = "C";
        } else {
            Grade = "F";  // Assign 'F' for Grades below 60
        }

        // display output in Joptionpane
        JOptionPane.showMessageDialog(null, "Overall marks: " + totalMarks 
        + "\nGrade: " + Grade);
    }
}

public class multilevelinheritence {
    public static void main(String[] args) {
    Grade g= new Grade();

    g.subjectRegister();
    g.calculateMarks();
    g.calculateGrade();

    // write into txt file "subjectmarks.txt"
    try (PrintWriter out=new PrintWriter((new FileWriter("subjectmarks.txt"))))
    {
        out.println("\n+++" + g.Subject + "+++");
        out.println("Code " + g.SubjectCode);
        out.println("\nMarks 1= " + g.Marks[0]);
        out.println("Marks 2= " + g.Marks[1]);
        out.println("Marks 3= " + g.Marks[2]);
        out.println("------------------------");
        out.println("Overall marks: " + g.totalMarks);
        out.println("Grade: " + g.Grade);
        out.println("------------------------");
    
        System.out.println("\nSuccessfully restore data in file.\n");
        out.close();
    }
    catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    } 
    }
}
