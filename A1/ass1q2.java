//program to ask Sarah to insert Charges she needs to pay and amount she wants to pay.
//output on screen the balance of the payment (if any) 

import java.util.*;

class ass1q2 
{
	public static void main (String [] args)
	{
	Scanner sc = new Scanner (System.in);
	Scanner sc1 = new Scanner (System.in);
	
	//input late charges for sarah
	System.out.print("Enter the total late charges: RM");
	double lateCharges = sc.nextDouble();

	//input amount sarah pay
	System.out.print("Enter the amount sarah want to pay: RM");
	double amountPayment = sc.nextDouble();

	//calc balance
	double balance = amountPayment - lateCharges;

	//display balance
	System.out.println("Balance is: RM" + balance);
	System.out.println("");

	//input 5 book sarah want to borrow
	System.out.println("Enter 5 books details to borrow.");

	System.out.println("Book 1");
	System.out.print("1.Name:");
	String namebook1 = sc1.nextLine();
	System.out.print("2.No ISBN:");
	String isbnbook1 = sc1.nextLine();
	System.out.println("");


	System.out.println("Book 2");
	System.out.print("1.Name:");
	String namebook2 = sc1.nextLine();
	System.out.print("2.No ISBN:");
	String isbnbook2 = sc1.nextLine();
	System.out.println("");


	System.out.println("Book 3");
	System.out.print("1.Name:");
	String namebook3 = sc1.nextLine();
	System.out.print("2.No ISBN:");
	String isbnbook3 = sc.nextLine();
	System.out.println("");


	System.out.println("Book 4");
	System.out.print("1.Name:");
	String namebook4 = sc1.nextLine();
	System.out.print("2.No ISBN:");
	String isbnbook4 = sc1.nextLine();
	System.out.println("");

	System.out.println("Book 5");
	System.out.print("1.Name:");
	String namebook5 = sc1.nextLine();
	System.out.print("2.No ISBN:");
	String isbnbook5 = sc1.nextLine();
	System.out.println("");

	//display borrowed book
	System.out.println("======= Book List: =======");
	System.out.println("1. " + namebook1 + ". ISBN: " + isbnbook1);
	System.out.println("2. " + namebook2 + ". ISBN: " + isbnbook2);
	System.out.println("3. " + namebook3 + ". ISBN: " + isbnbook3);
	System.out.println("4. " + namebook4 + ". ISBN: " + isbnbook4);
	System.out.println("5. " + namebook5 + ". ISBN: " + isbnbook5);
	}
}
