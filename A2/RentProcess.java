//Program for a. Homestay Rental Application 

//Class – RentalDetails, RentProcess
//Data- name, Address, phoneNo, deposit
//Method- RentalsDetails(), Print()

import java.util.*;

class RentalDetails
{
	String name, address;
	int phoneNo;
	double deposit;

	RentalDetails(){};
}

public class RentProcess
{
	public static void RentalsDetails()
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
	}

	public static void Print()
	{
	RentalsDetails();
	}	

	public static void main(String[]args)
	{
	Print();
	}	
}




