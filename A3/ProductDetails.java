import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class ProductDetails {

   	String[] ProductName = new String[5];
    	double[] ProductPrice = new double[5];
        double TotalPrice = 0;

    public void PaymentDetails() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; ++i) {
            System.out.println("\nProduct " + (i + 1) + " : ");
            System.out.println("Enter product name : ");
            ProductName[i] = sc.nextLine();
            System.out.print("Enter the product price : RM");
            ProductPrice[i] = sc.nextDouble();

	// Consume the newline character left in the buffer
        sc.nextLine();
        }
    }

    public void Print() {
        for (int i = 0; i < 5; ++i) {
            System.out.println("\n" + (i + 1) + ". " + ProductName[i] + ", " + ProductPrice[i]);
            TotalPrice += ProductPrice[i];
        }

        // Display total price using JOptionPane
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Total Price: " + TotalPrice);
    }
}
