//program to input user data

import java.util.*; //*(astrik is a global scanner)
class Regclub
{

	public static void main (String [] args)
	 {
	 
	 Scanner sc = new Scanner(System.in); //system.in is specific for keyboard input
	 System.out.println("Insert your name:");
	 String name = sc.nextLine(); //to store the input in sc //nextline(); is for string
	 
	 System.out.println("Insert your matric ID:");
	 int id = sc.nextInt(); //nextInt(); is for int

	 System.out.println("Name:" +name);
	 System.out.println("Matric ID:" +id);


	 System.out.println("Successfull Registeration!");
	 }
}
	 