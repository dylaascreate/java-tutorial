//Module 2
//1.User are able to calculate the amount price of products. (Example : input 5 products)
//2.User able to display all paid products
//3.User able to calculate payment balance
//4.Display payment in JOPtionPane

import javax.swing.JOptionPane;
import java.io.IOException;

public class CalculatePrice {
    public CalculatePrice() throws IOException {
        ProductDetails pd = new ProductDetails();
        pd.PaymentDetails();
        pd.Print();

        // Prompt the user to enter the amount they want to pay
        String inputAmount = JOptionPane.showInputDialog("Enter the amount you want to pay:");
        double paidAmount = Double.parseDouble(inputAmount);

        // Calculate and display the balance
        double totalAmount = pd.TotalPrice;
        double balance = totalAmount - paidAmount;

        JOptionPane.showMessageDialog(null, "Total Price: RM " + totalAmount + "\nPaid Amount: RM " + paidAmount +
                "\nBalance: RM " + balance);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("\n=== Calculate product price ===");
        CalculatePrice cp = new CalculatePrice();
    }
}
