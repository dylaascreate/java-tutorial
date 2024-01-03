//program to calculate number of students in 2 class

import java.util.*;
class CalTotal //class for "data" only
{
	int group1=2;
	int group2=2;

	String name;
	int id;

	CalTotal(){}; //connection link for another class to call
}

class TotStudent //class for "method"
{
	CalTotal sum = new CalTotal(); //declare new statement to call data from another class
	int totalstudent= sum.group1+sum.group2; //point to the data storage
	TotStudent(){};
}

class Regclub1
{
	public static void main (String [] args)
	{	 
	CalTotal sum = new CalTotal();
	TotStudent sum1 = new TotStudent();
	Scanner sc = new Scanner(System.in); //system.in is specific for keyboard input

	System.out.println("Insert your name:");
	sum.name = sc.nextLine(); //to store the input in sc //nextline(); is for string
	 
	System.out.println("Insert your matric ID:");
	sum.id = sc.nextInt(); //nextInt(); is for int

	System.out.println("Name:" +sum.name);
	System.out.println("Matric ID:" +sum.id);


	System.out.println("Overall student is:" +sum1.totalstudent);
	System.out.println("Successfull Registeration!");
	}
}

