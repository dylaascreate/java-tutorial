import javax.swing.*;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

class MarkDetails 
{
	double[] marks = new double[5];
	String[] grades = {"A", "B", "C", "D", "F"};
}

public class GradePredictionApp 
{
	MarkDetails md = new MarkDetails();
	double totalMarks; //declare method variable as global variable
	int predictedGrade;

	Scanner sc = new Scanner(System.in);

 void getMark() {
	for (int i = 0; i < 5; ++i) {
	String markInput = JOptionPane.showInputDialog(null, "Enter your marks for subject " + (i + 1) + ":");
	
	try {
	md.marks[i] = Double.parseDouble(markInput);
	} catch (NumberFormatException e) {
	JOptionPane.showMessageDialog(null, "Invalid input for marks. Please enter a valid number.");
	System.exit(1);
	}
        }
 }

 void writeMark() {
        try (PrintWriter writer = new PrintWriter("CalculateGrade.txt")) {
	for (double mark : md.marks) {
	  writer.println(mark);
	}
        } catch (IOException e) {
	JOptionPane.showMessageDialog(null, "Error writing marks to file: " + e.getMessage());
	System.exit(1);
        }
 }

 void predictGrade() {
	totalMarks = 0;
        for (double mark : md.marks) {
	  totalMarks += mark;
        }

        // Predict grade based on user input marks
        if (totalMarks >= 90) {
            predictedGrade = 0; // A
        } else if (totalMarks >= 80) {
            predictedGrade = 1; // B
        } else if (totalMarks >= 70) {
            predictedGrade = 2; // C
        } else if (totalMarks >= 60) {
            predictedGrade = 3; // D
        } else {
            predictedGrade = 4; // F
        }

        JOptionPane.showMessageDialog(null, "Predicted Grade: " + md.grades[predictedGrade]);
    }

 void readMark() {
        //ask user if they want to see all marks, total, and predicted grade
        int option = JOptionPane.showConfirmDialog(null, "Do you want to see all marks, total, and predicted grade?",
	"Show Marks", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
	  StringBuilder sb= new StringBuilder();
	  for (int i = 0; i < 5; ++i) {
		sb.append("Subject ").append(i + 1).append(": ").append(md.marks[i]).append("\n");
	  }
	  sb.append("Total Marks: ").append(totalMarks).append("\n");
	  sb.append("Predicted Grade: ").append(md.grades[predictedGrade]);

	  JOptionPane.showMessageDialog(null, sb.toString());
        }
 }

	public static void main(String[] args) throws IOException 
	{
        GradePredictionApp app = new GradePredictionApp();
        app.getMark(); //call for method
        app.writeMark();
        app.predictGrade();
        app.readMark();
	}
}
