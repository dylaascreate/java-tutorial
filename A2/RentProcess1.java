//program to connect two file and write data into a file

import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;																		

public class RentProcess1
{
	RentProcess1() throws IOException
	{
	RentalDetails rd= new RentalDetails();
	Scanner sc= new Scanner (System.in);

	rd.Print();
	}	

	public static void main(String[]args) throws IOException
	{
		RentProcess1 rp= new RentProcess1();
	}	
}