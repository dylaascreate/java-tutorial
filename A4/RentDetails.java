// program to display all the information on the renter

import javax.swing.JOptionPane;
import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RentDetails {
    
    int HouseID;
    String NameRenter;
    String ICNoRenter;
    String Address;
    String Phone;

    RentDetails(){
    }

    void DisplayDetails() throws IOException{

        Scanner sc= new Scanner(System.in);

        System.out.println("\n=== RENT DETAILS ===");
        System.out.print("Enter HouseID: ");
        HouseID = sc.nextInt();
        
        NameRenter= JOptionPane.showInputDialog(null, "Enter NameRenter:");
	    ICNoRenter= JOptionPane.showInputDialog(null, "Enter ICNoRenter:");
	    Address= JOptionPane.showInputDialog(null, "Enter Address:");
        Phone= JOptionPane.showInputDialog(null, "Enter Phone:");
        
    // to display int variables with leading zeros
    String formattedHouseID= String.format("%03d", HouseID);

    JOptionPane.showMessageDialog(null, 
    "HouseID: " + HouseID + 
    "\nName Renter: " + NameRenter + 
    "\nICNo: " + ICNoRenter + 
    "\nAddress: " + Address + 
    "\nPhoneNo: " + Phone);

        // System.out.println("HouseID: " + formattedHouseID);
        // System.out.println("Name Renter: " + NameRenter);
        // System.out.println("ICNo: " + ICNoRenter);
        // System.out.println("Address: " + Address);
        // System.out.println("PhoneNo: " + Phone);

        // write data in file
        try (PrintWriter out=new PrintWriter((new FileWriter("RentDetails.txt"))))
        {
        out.println("\n=== RENT DETAILS ===");
        out.println("Name Renter: " + NameRenter);
        out.println("ICNo: " + ICNoRenter);
        out.println("Address: " + Address);
        out.println("PhoneNo: " + Phone);
        out.println("HouseID: " + formattedHouseID);

        JOptionPane.showMessageDialog(null,"Successfully restore data in file.");
        out.close();
    }
    catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    } 

    }
}
