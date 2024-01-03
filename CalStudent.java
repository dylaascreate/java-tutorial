//program to calculate number of students in 2 class

class CalStudent //class for "data" only
{
	int group1= 10; //10 students
	int group2=15; //15 students

	CalStudent(){}; //connection link for another class to call
}

class TotStudent //class for "method"
{
	public static void main (String [] args)
	{
	CalStudent sum= new CalStudent(); //declare new statement to call data from another class
	
	int totalstudent= sum.group1+sum.group2; //point to the scanner
	System.out.println("Overall student is:" +totalstudent);
	}
}
	