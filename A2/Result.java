//Program for c.Calculate Exam Result Application

//Class – MarksDetails, Result
//Data- name, matric, subject_name (3 name), subject_marks (3 marks), Result
//Method- CalculateMarks(), PrintResult()

import java.util.*;

class MarksDetails
{
	String subject_name1, subject_name2, subject_name3;
	int MarkSub1, MarkSub2, MarkSub3, Result;
}

public class Result
{
	public static void CalculateMarks()
	{	
	Scanner sc= new Scanner(System.in);
	MarksDetails md= new MarksDetails();
	
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
	}
	
	public static void PrintResult()
	{
		CalculateMarks();
	}
	
	public static void main (String[] args)
	{
		String name, matric;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name= sc.nextLine();
		System.out.println("Enter matric: ");
		matric= sc.nextLine();
		
		PrintResult();
	}
}
