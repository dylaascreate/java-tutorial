//java program to calculate 2 numbers

import java.util.*;
class Calculation {
	public static void main (String []args)
	{
	
	Scanner sc = new Scanner (System.in);

	System.out.println ("Enter number 1:");
	int num1 = sc.nextInt();

	System.out.println ("Enter number 2:");
	int num2 = sc.nextInt();

	int total=num1+num2;
	System.out.println ("Total of 2 numbers is:" + total);
	}
}