import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class ParkingDetails
{
    // initialize array
    int DetailsCount = 5;
    int[] ParkingID = new int[DetailsCount];
    String[] Status = new String[DetailsCount];
    int[] TimeIn = new int[DetailsCount];
    int[] TimeOut = new int[DetailsCount];
    float[] AmountTime = new float[DetailsCount];
    int[] Payment = new int[DetailsCount];

  ParkingDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\n=== PARKING DETAILS ===");

        System.out.println("Please enter the parking details below.");
        for (int i=0; i<DetailsCount; ++i) {
            System.out.print( (i+1) + ". ");
            System.out.print("\nParkingID= ");
            ParkingID[i] = sc.nextInt();
            System.out.print("Status (Active/Inactive)= ");
            Status[i] = sc.next();
            System.out.print("TimeIn= ");
            TimeIn[i] = sc.nextInt();
            System.out.print("TimeOut= ");
            TimeOut[i] = sc.nextInt();
            System.out.print("AmountTime= ");
            AmountTime[i] = sc.nextFloat();
            System.out.print("Payment= RM ");
            Payment[i] = sc.nextInt();
        }

	try (PrintWriter out=new PrintWriter((new FileWriter("ParkingDetails.txt"))))
        {
            out.println("\n=== PARKING DETAILS ===");
            for (int i = 0; i < DetailsCount; ++i) {
            // Format the ParkingID with leading zeros
            String formattedParkingID = String.format("%03d", ParkingID[i]);
    
            out.print( (i + 1) + ". ");
            out.println("\nParkingID= " + formattedParkingID);
            out.println("Status= " + Status[i]);
            out.println("TimeIn= " + TimeIn[i]);
            out.println("TimeOut= " + TimeOut[i]);
            out.println("AmountTime= " + AmountTime[i] + " minutes");
            out.println("Payment= RM " + Payment[i]);
            out.println("------------------------");
            } 
            System.out.println("\nSuccessfully restore data in file.\n");
            out.close();
        }
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } 
}

  // Display method
    void DisplayDetails() throws IOException 
    {

        for (int i = 0; i < DetailsCount; i++) {
            // Format the ParkingID with leading zeros
            String formattedParkingID = String.format("%03d", ParkingID[i]);

            System.out.println("Parking " + (i + 1) + ":");
            System.out.println("ParkingID: " + formattedParkingID);
            System.out.println("Status= " + Status[i]);
            System.out.println("TimeIn= " + TimeIn[i]);
            System.out.println("TimeOut= " + TimeOut[i]);
            System.out.println("AmountTime= " + AmountTime[i] + " minutes");
            System.out.println("Payment= RM " + Payment[i]);
            System.out.println("------------------------------");
        }

    }
}

