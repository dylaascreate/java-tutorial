//program to calculate number of students in 2 class

import java.util.*;
class CalTotal //class for "data" only
{
	int group1;
	int group2;

	CalTotal(){}; //connection link for another class to call
}

class TotStudent1 //class for "method"
{
	public static void main (String [] args)
	{
	CalTotal sum = new CalTotal(); //declare new statement to call data from another class
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter total student in group 1:");
	sum.group1 = sc.nextInt();
	
	System.out.println("Enter total student in group 2:");
	sum.group2 = sc.nextInt();

	int totalstudent= sum.group1+sum.group2; //point to the data storage
	System.out.println("Overall student is:" +totalstudent);
	}
}