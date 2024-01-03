import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class OwnerDetails {

// Name: String
// Address:String
// Phone:String

    String Name= "Ali Bin Abu";
    String Address= "Jalan 1, Taman Bahtera";
    String Phone= "017-865523";

OwnerDetails(){}
    
void DisplayDetails(){
        System.out.println("\n=== OWNER DETAILS ===");
        System.out.println("Name : " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Phone);
        System.out.println("------------------------------");

    }

    private void readAndDisplayRentDetails() throws IOException {
        System.out.println("\n=== RENT DETAILS ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("RentDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // main function
    public static void main (String[]args) throws IOException{
        
// Example of Data:
// Name Renter: Ali bin Ahmad
// ICNo: 123456014536
// Address: No 1 Jalan Kepang 5
// PhoneNo: 011-4567893
// HouseID: 001
// MonthPay: 1
// MonthAmount:RM150
// Status:Occupied

        OwnerDetails od= new OwnerDetails();
        od.DisplayDetails();
        HousePayment hp= new HousePayment();
        hp.DisplayDetails();

        // Read and display RentDetails from the file
        try {
            od.readAndDisplayRentDetails();
        } catch (IOException e) {
            System.err.println("Error reading RentDetails file: " + e.getMessage());
        }
    }
}

class HousePayment {

// HouseID:Int
// Address:String
// MonthPay: Int
// MonthAmount: String
// ArrearPayment:int // past-due
    
    RentDetails rd = new RentDetails();

    int HouseID= rd.HouseID;
    String Address= rd.Address;
    int MonthPay;
    String MonthAmount;
    int ArrearPayment;

    int MonthlyPayment;

    HousePayment() throws IOException {
        rd.DisplayDetails();

        Scanner sc= new Scanner(System.in);

        System.out.println("\n=== PAYMENT DETAILS ===");
        System.out.print("Enter MonthPay: ");
        MonthPay= sc.nextInt();
        System.out.print("Do you have ArrearPayment? (y/n): ");
        String arrearChoice = sc.next().toLowerCase();

        int ArrearPayment = 0; // Default value if "no"
        switch (arrearChoice) {
            case "y":
                System.out.print("Enter ArrearPayment: RM ");
                ArrearPayment = sc.nextInt();
                break;
            case "n":
                // ArrearPayment is already set to 0, no need to do anything here
                break;
            default:
                System.out.println("Invalid choice. Assuming ArrearPayment = 0.");
                break;
        }

        System.out.print("Enter MonthlyPayment: RM ");
        MonthlyPayment = sc.nextInt();

        MonthlyPayment += ArrearPayment;
        MonthAmount = "" + MonthlyPayment;

        System.out.println("MonthAmount: RM " + MonthAmount);

    };

    void DisplayDetails() throws IOException{
        try (PrintWriter out = new PrintWriter(new FileWriter("RentDetails.txt", true)))
        // add boolean condition to avoid overwrite file 
        {
            out.println("MonthPay: " + MonthPay);
            out.println("MonthAmount: " + MonthAmount);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        HouseRental hr= new HouseRental();
        hr.DisplayDetails();
    }
}
