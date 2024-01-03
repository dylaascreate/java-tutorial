//Program for b.Food Ordering Application

//Class – OrderDetails, PersonDetails
//Data- name, address, order food (3 types), phoneNo, payment
//Method- OrderDetails(), Print()

import java.util.*;

class PersonDetails
{
	String name, address, food1, food2, food3, phoneNo;
	Double payment;
    public void Print() {
    }
}

public class OrderDetails
{
	public static void OrderDetails()
	{
	Scanner sc= new Scanner (System.in);
	PersonDetails pd= new PersonDetails();
	
	//user input
	System.out.print("Enter your name: ");
	pd.name= sc.nextLine();
	System.out.print("Enter your address: ");
	pd.address= sc.nextLine();

	System.out.println("Enter 3 type of food: 1-Laksa 2-Nasi 3-Pasta 4-Sup 5-Dessert");
	System.out.print("1-");
	pd.food1= sc.nextLine();
	System.out.print("2-");
	pd.food2= sc.nextLine();
	System.out.print("3-");
	pd.food3= sc.nextLine();

	System.out.print("Enter your phone number: ");
	pd.phoneNo= sc.next();
	System.out.print("Enter your payment: ");
	pd.payment= sc.nextDouble();
	
	//display output
	System.out.println("\n====== Order Details ======");
	System.out.println("Name: " + pd.name);
	System.out.println("Address: " + pd.address);
	System.out.println("3 type of food:");
	System.out.println("1-" + pd.food1);
	System.out.println("2-" + pd.food2);
	System.out.println("3-" + pd.food3);
	System.out.println("Phone Number: " + pd.phoneNo);
	System.out.println("Payment: RM" + pd.payment);
	}

	public static void Print()
	{
	OrderDetails();
	}
	
	public static void main(String[]args)
	{
	Print();
	}	
}




