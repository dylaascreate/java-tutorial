import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;	

class RentalDetails
{
	String name, address;
	int phoneNo;
	double deposit;

	public static void RentalsDetails() throws IOException
	{
	Scanner sc= new Scanner (System.in);
	RentalDetails rd= new RentalDetails();

	//user input
	System.out.print("Enter your name: ");
	rd.name= sc.nextLine();
	System.out.print("Enter your address: ");
	rd.address= sc.nextLine();
	System.out.print("Enter your phone number: ");
	rd.phoneNo= sc.nextInt();
	System.out.print("Enter your deposit: ");
	rd.deposit= sc.nextDouble();
	
	//display output	
	System.out.println("\n====== Rental Details ======");
	System.out.println("Name: " + rd.name);
	System.out.println("Address: " + rd.address);
	System.out.println("Phone Number: " + rd.phoneNo);
	System.out.println("Deposit: RM" + rd.deposit);
	
	//create file and print in file
	PrintWriter out=new PrintWriter("RentalDetails.txt");
	out.println("\n====== Rental Details ======");
	out.println("Name: " + rd.name);
	out.println("Address: " + rd.address);
	out.println("Phone Number: " + rd.phoneNo);
	out.println("Deposit: RM" + rd.deposit);
	
	out.close();
	}

	public static void Print() throws IOException
	{
	RentalsDetails();
	}	

}