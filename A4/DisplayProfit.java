import java.io.IOException;

public class DisplayProfit 
{

// ParkingID: int
// Amount:
// FinalAmount

        float FinalAmount = 0;

DisplayProfit() throws IOException
{
	
        // ParkingDetails pd= new ParkingDetails();
        CalMonthProfit cmp= new CalMonthProfit();

        // pd.DisplayDetails();
        cmp.DisplayDetails();


        int[] ParkingID= cmp.ParkingID;
        float[] Amount = new float[cmp.DetailsCount];

        // Display profit-related details
        for (int i = 0; i < cmp.DetailsCount; ++i) {
            // Assuming Amount and FinalAmount are calculated somehow
            Amount[i] = cmp.AmountTime[i] * cmp.Payment[i];
        
        }
        // Sum up the individual amounts to calculate FinalAmount
        for (int i = 0; i < cmp.DetailsCount; ++i) {
            FinalAmount += Amount[i];
        }
 
}
   void DisplayDetails() throws IOException
    {

        System.out.println("FinalAmount: RM " + FinalAmount);
        System.out.println("------------------------------");

    }
    
    public static void main (String[]args) throws IOException
    {

// Example of Data:
// ParkingID: 001
// Status:Active
// TimeIn: 10.00
// TimeOut:12.00
// AmountTime:70 minutes
// Payment: RM 50
// AmountCollect: RM1000
// FinalAmount:RM20000
// Note: Please insert for 5 parking lot. 
	
	DisplayProfit dp= new DisplayProfit();
	dp.DisplayDetails();
    }
}
