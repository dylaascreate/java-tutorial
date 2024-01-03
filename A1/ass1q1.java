//program to ask Ali insert the name of each fruit and calculate the total he needs to pay

import java.util.*;
class fruitDetails
{
	double mangoPrice = 23;
	double grapePrice = 20;
	double orangePrice = 10;

	fruitDetails (){};
}

class ass1q1
{ 
	
 	public static void main (String [] args)
	{
	fruitDetails price = new fruitDetails ();
	Scanner sc = new Scanner (System.in);

	//ask ali to insert fruit name
	System.out.println("Enter fruit 1 name (mango/grape/orange):");
	String fruit1 = sc.nextLine();

	System.out.println("Enter fruit 2 name (mango/grape/orange):");
	String fruit2 = sc.nextLine();

	System.out.println("Enter fruit 3 name (mango/grape/orange):");
	String fruit3 = sc.nextLine();

	//input for mango
	System.out.println("Enter the quantity of mango(kg):");
	double mangoQuantity = sc.nextDouble();
	double mangoTotal = mangoQuantity * price.mangoPrice;

	//input for grape
	System.out.println("Enter the quantity of grape(kg):");
	double grapeQuantity = sc.nextDouble();
	double grapeTotal = grapeQuantity * price.grapePrice;

	//input for orange
	System.out.println("Enter the quantity of orange(kg):");
	double orangeQuantity = sc.nextDouble();
	double orangeTotal = orangeQuantity * price.orangePrice;

	//calc total all
	double totalCost = mangoTotal + grapeTotal + orangeTotal;

	//display all purchase & amount ali need to pay
	System.out.println("The total amount to pay: RM" + totalCost);
	}
}

