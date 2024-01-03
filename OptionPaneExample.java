import javax.swing.*; //global
//import javax.swing.JOptionPane; //specific
import java.util.*;

class OptionPaneExample
{
	JFrame f; //dont need this if use null
	
	OptionPaneExample()
	{
	 Scanner sc= new Scanner (System.in);
	 f= new JFrame(); //dont need this if null is used

	 //JOptionPane.showMessageDialog(null, "DTS3093 Group A");
	 //JOptionPane.showMessageDialog(f, "DTS3093 Group A");
	 //JOptionPane.showMessageDialog(f, "Wednesday 2-5pm", "Alert", "DTS3093 Group A", JOptionPane.WARNING_MESSAGE);

	 //String name= JOptionPane.showInputDialog(f, "Enter Name:");
	 //JOptionPane.showMessageDialog(f, name + " is such a beautiful name!");
	 //System.out.println(name + " is such a beautiful name!");

	//System.out.println("Enter your name:");
	//String name= sc.nextLine();
	//System.out.println("Enter your matric:");
	//String matric= sc.nextLine();
	//System.out.println("Enter your course:");
	//String course= sc.nextLine();

	String name= JOptionPane.showInputDialog(f, "Enter Name:");
	String matric= JOptionPane.showInputDialog(f, "Enter Matric:");
	String course= JOptionPane.showInputDialog(f, "Enter Course:");

	JOptionPane.showMessageDialog(f, "Hi, " + name + "\nNo Matrik: " + matric + "\nCourse: " + course);
	}

	public static void main (String[]args)
	{
	 new OptionPaneExample();
	}
}