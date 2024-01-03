//program to ask Ali insert the name of each fruit and calculate the total he needs to pay

java.util.*;
class ass1-q1
{ 
 	public static void main (Strinf [] args)
	{
	Scanner sc = new Scanner (SYtem.in);

	//input for mango
	System.out.prntln("Enter the quantity of mango (kg):");
	double mangoQuantity = sc.nextDouble();
	double mangoPrice = 23;
	double mangoTotal = mangoQuantity * mangoPrice;

	//input for grape
	System.out.println("Enter the quantity of grape (kg):");
	double grapeQuantity = sc.nextDouble();
	double grapePrice = 20;
	double grapeTotal = grapeQuantity * grapePrice;

	//input for orange
	System.out.println("Enter the quantity of orange (kg):");
	double orangeQuantity = sc.nextDouble();
	double orangePrice = 10;
	double orangeTotal = orangeQuantity * orangePrice;

	//calc total all
	double totalCost = mangoTotal + grapeTotal + orangeTotal;

	//display amount ali need to pay
	System.out.println("The total amount to pay: RM" + totalCost);
	}
}

