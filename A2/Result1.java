//program to connect two file and write data into a file

import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;																		

public class Result1
{
	Result1() throws IOException
	{
	Scanner sc= new Scanner(System.in);
	MarksDetails md= new MarksDetails();
	
	md.PrintResult();
	}

	public static void main(String[]args)throws IOException
	{
		Result1 rs= new Result1();
	}	
}