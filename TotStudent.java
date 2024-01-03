//program to calculate number of students in 2 class

class CalTotal //class for "data" only
{
	int group1= 10;
	int group2=15;

	CalTotal(){}; //connection link for another class to call
}

class TotStudent //class for "method"
{
	public static void main (String [] args)
	{
	CalTotal sum= new CalTotal(); //declare new statement to call data from another class
	
	int totalstudent= sum.group1+sum.group2; //point to the data storage
	System.out.println("Overall student is:" +totalstudent);
	}
}
	