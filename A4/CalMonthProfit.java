import java.io.IOException;

public class CalMonthProfit {

	ParkingDetails pd = new ParkingDetails();

    int DetailsCount = pd.DetailsCount;
    int[] ParkingID = pd.ParkingID;
    String[] Status = pd.Status;
    int[] TimeIn = pd.TimeIn;
    int[] TimeOut = pd.TimeOut;
    float[] AmountTime = pd.AmountTime;
    int[] Payment = pd.Payment;

    int AmountCollect = 0;

    void DisplayDetails() throws IOException {


        for (int i = 0; i < DetailsCount; i++) {
            AmountCollect += Payment[i];
        }
    pd.DisplayDetails();
    System.out.println("AmountCollect: RM " + AmountCollect);
    
        }

   
}
