import javax.swing.*;
import java.io.IOException;

public class ProductDetails1 {

    String[] productNames = new String[5];
    double[] productPrices = new double[5];

    public static void main(String[] args) throws IOException {
        ProductDetails1 pd = new ProductDetails1();
        pd.paymentDetails();
        pd.print();
    }

    public void paymentDetails() {
        JFrame f = new JFrame();

        for (int i = 0; i < 5; ++i) {
            // User input using JOptionPane
            productNames[i] = JOptionPane.showInputDialog(f, "Enter your product " + (i + 1) + " name:");
            String priceInput = JOptionPane.showInputDialog(f, "Enter the product price for " + productNames[i] + ":");
            
            try {
                productPrices[i] = Double.parseDouble(priceInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(f, "Invalid input for price. Please enter a valid number.");
                // You might want to handle this error more gracefully, e.g., asking the user to enter the price again.
                System.exit(1);
            }
        }

        double totalPrice = 0;
        for (int i = 0; i < 5; ++i) {
            JOptionPane.showMessageDialog(f, (i + 1) + ". " + productNames[i] + ", " + productPrices[i]);
            totalPrice += productPrices[i];
        }

        JOptionPane.showMessageDialog(f, "Total Price: " + totalPrice);
    }

    public void print() {
        // You can add more logic for printing or saving the details if needed.
    }
}
