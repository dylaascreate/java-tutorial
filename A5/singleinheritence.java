package A5;

import java.util.*;
import javax.swing.JOptionPane;
import java.io.PrintWriter; //write file
import java.io.FileWriter;
import java.io.IOException;

class House {
    Scanner sc= new Scanner (System.in);
    String HouseType, HouseAddress;

    void aboutHouse(){
        System.out.println("\n==HOUSE INFORMATION==");
        System.out.println("Enter type of house: ");
        HouseType= sc.nextLine();
        System.out.println("Enter address of house:");
        HouseAddress= sc.nextLine();
    }
}

class Renter extends House {
    Scanner sc= new Scanner(System.in);
    String RenterName, Phone;
    int Ic;

    void aboutRenter(){
        System.out.println("\n==RENTER INFORMATION==");
        System.out.println("Enter renter name: ");
        RenterName= sc.nextLine();
        System.out.println("Enter phone no:");
        Phone= sc.nextLine();
        System.out.println("Enter IC no:");
        Ic= sc.nextInt();
    }
}

public class singleinheritence {
    public static void main(String[] args) throws IOException {
        Renter r= new Renter();

        r.aboutHouse();
        r.aboutRenter();

        // display output in Joptionpane
        JOptionPane.showMessageDialog(null, "Renter " + r.RenterName +
        "\nPhone No: " + r.Phone + "\nIc No: " + r.Ic + "\n\n" + r.HouseType +
        ", " + r.HouseAddress);

        // write into txt file "houserenter.txt"
        try (PrintWriter out=new PrintWriter((new FileWriter("houserenter.txt"))))
        {
            out.println("\n=== HOUSING DETAILS ===");
    
            out.println("\nType of House= " + r.HouseType);
            out.println("Address of the House= " + r.HouseAddress);
            out.println("\nRenter Name= " + r.RenterName);
            out.println("Phone Number= " + r.Phone);
            out.println("IC Number= " + r.Ic);
            out.println("------------------------");
        
            System.out.println("\nSuccessfully restore data in file.\n");
            out.close();
        }
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } 

    }
}
