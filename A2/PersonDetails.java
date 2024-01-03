import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
// import java.io.FileNotFoundException;

class PersonDetails
{
	String name, address, food1, food2, food3, phoneNo;
	Double payment;
	
	public static void OrderDetails() throws IOException
	{
	Scanner sc= new Scanner (System.in);
	PersonDetails pd= new PersonDetails();
	
	//user input
	System.out.print("Enter your name: ");
	pd.name= sc.nextLine();
	System.out.print("Enter your address: ");
	pd.address= sc.nextLine();

	System.out.println("Enter 3 type of food: \n 1-Laksa 2-Nasi 3-Pasta 4-Sup 5-Dessert");
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
	
	//create file and print in file
	PrintWriter out=new PrintWriter("OrderDetails.txt");
	out.println("\n====== Order Details ======");
	out.println("Name: " + pd.name);
	out.println("Address: " + pd.address);
	out.println("3 type of food:");
	out.println("1-" + pd.food1);
	out.println("2-" + pd.food2);
	out.println("3-" + pd.food3);
	out.println("Phone Number: " + pd.phoneNo);
	out.println("Payment: RM" + pd.payment);
	
	out.close();
	}

	public static void Print() throws IOException
	{
	OrderDetails();
	}
}
