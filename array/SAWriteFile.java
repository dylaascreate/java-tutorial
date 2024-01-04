package array;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class SAWriteFile {
    
    public static void main(String[] args) throws FileNotFoundException 
    {

        // 3. object -> input
        Scanner sc = new Scanner(System.in);
        Student[] stdList = new Student[5]; // reference variable

        // Loop through array to populate it with user input
        for (int i = 0; i < stdList.length; i++) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Cpa: ");
            double cpa = sc.nextDouble();            
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            stdList[i] = new Student(name, cpa, age);
        }

        PrintWriter out= new PrintWriter("studentList.txt");
            for (int i=0; i< stdList.length; i++)
            {
                out.println(stdList[i].name);
                out.println(stdList[i].cpa);
                out.println(stdList[i].age);
            }
        // Close the PrintWriter to ensure data is flushed and the file is closed
        out.close();
        
    }
}
