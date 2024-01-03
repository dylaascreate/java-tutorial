//program to connect two file and write data into a file

// import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
// import java.io.FileNotFoundException;																		

public class OrderDetails1
{
	OrderDetails1() throws IOException
	{
	Scanner sc= new Scanner (System.in);
	PersonDetails pd= new PersonDetails();
	
	pd.Print();
	}
	public static void main(String[]args)throws IOException
	{
		OrderDetails1 od= new OrderDetails1();
	}	
}