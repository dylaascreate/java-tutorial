//program to connect two file and write data into a file

import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
// import java.io.FileNotFoundException;

public class Adding
{
	Adding() throws IOException
	{
	AddNum an=new AddNum(); //parameter constructor

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number 3:");
	int Num3= sc.nextInt();

	int Total=an.Num1+an.Num2+Num3;
	System.out.println("Total is:" + Total);
	
	PrintWriter out=new PrintWriter("Total.txt");
	out.println("Total is: "+ Total);
	out.close();
	}

	public static void main (String[]args) throws IOException
	{	
	Adding ad=new Adding();
	}
}																		