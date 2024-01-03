import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class HouseRental {

    // HouseID: Int
    // NameRenter: String
    // ICNoRenter: String
    // AddressRenter:String
    // PhoneRenter:String
    // Status: String
    RentDetails rd = new RentDetails();

    int HouseID = rd.HouseID;
    String ICNoRenter = rd.ICNoRenter;
    String AddressRenter = rd.Address;
    String PhoneRenter = rd.Phone;
    String Status; // Single string for the status

    HouseRental() throws IOException {
    }

    void DisplayDetails() 
    {
        String[] options = { "Not Occupied", "Occupied" };
        int choice = JOptionPane.showOptionDialog(null, "Choose status rental.", "Status",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                Status = "Not Occupied";
                System.out.println("Not Occupied");
                break;
            case 1:
                Status = "Occupied";
                System.out.println("Occupied");
                break;
            default:
                Status = "Not Occupied"; // Default to "Not Occupied" if no valid choice
                System.out.println("Not Occupied");
                break;
        }

        try (PrintWriter out = new PrintWriter(new FileWriter("RentDetails.txt", true)))
        // add boolean condition to avoid overwrite file 
        {
            out.println("Status: " + Status);
            JOptionPane.showMessageDialog(null,"Successfully restore data in file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
}
