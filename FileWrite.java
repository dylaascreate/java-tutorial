// program to create file and write data into file

//import java.io.File;  //create file
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

class FileWrite
{
	public static void main (String[]args) throws IOException
	{
	Scanner sc=new Scanner(System.in);

	//open the file
	//PrintWriter out=new PrintWriter("Ocean.txt");
	//System.out.println("Fish");
	//System.out.println("Dolphin");

	PrintWriter out=new PrintWriter("Marks.txt");

	System.out.println ("Enter name:");
	String name= sc.nextLine();
	System.out.println ("Enter mark:");
	int mark= sc.nextInt();

	out.println(name + ", " + mark);

	//System.out.println("Aini, " + "80"); 	//display output in cmd
	//out.println("Rifhan, " + "90");	//display output in file

	out.close();
	}
}