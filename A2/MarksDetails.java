import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;

class MarksDetails 
{
	String name, matric;
	String subject_name1, subject_name2, subject_name3;
	int MarkSub1, MarkSub2, MarkSub3, Result;
	
	public static void CalculateMarks() throws IOException
	{	
	Scanner sc= new Scanner(System.in);
	MarksDetails md= new MarksDetails();
	
	System.out.println("Enter name: ");
	md.name= sc.nextLine();
	System.out.println("Enter matric: ");
	md.matric= sc.nextLine();
		
	//subject name
	System.out.println("Enter subject name 1: ");
	md.subject_name1= sc.nextLine();
	System.out.println("Enter subject name 2: ");
	md.subject_name2= sc.nextLine();
	System.out.println("Enter subject name 3: ");
	md.subject_name3= sc.nextLine();
	
	sc.nextLine(); //breakline
	
	//marks
	System.out.println("Enter marks for subject " + md.subject_name1 + ": ");
	md.MarkSub1= sc.nextInt();
	System.out.println("Enter marks for subject " + md.subject_name2 + ": ");
	md.MarkSub2= sc.nextInt();
	System.out.println("Enter marks for subject " + md.subject_name3 + ": ");
	md.MarkSub3= sc.nextInt();
	
	md.Result= md.MarkSub1 + md.MarkSub2 + md.MarkSub3;
	System.out.println("Result: " + md.Result);
	
	//create file and print in file
	PrintWriter out=new PrintWriter("MarksDetails.txt");
	out.println("\n====== Marks Details ======");
	out.println("Name: " + md.name);
	out.println("Matric: " + md.matric);
	
	out.println("Marks for each subject:");
	out.println(md.subject_name1 + ": " + md.MarkSub1);
	out.println(md.subject_name2 + ": " + md.MarkSub2);
	out.println(md.subject_name3 + ": " + md.MarkSub3);
	out.println("Result: " + md.Result);
	out.close();
	}
	
	public static void PrintResult() throws IOException
	{
		CalculateMarks();
	}
}