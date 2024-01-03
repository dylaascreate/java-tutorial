import java.util.*;
import java.io.*;

class DetailsProduct {
    int[] ProductCat = new int[5];
    String[] ProductName = new String[5];
    String[] ProductID = new String[5];
    double[] ProductPrice = new double[5];

    int TotalProduct = 5;

    DetailsProduct() {
    } // constructor
}

class RegisterProduct
{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DetailsProduct dp = new DetailsProduct(); // reference constructor

        for (int i = 0; i < dp.TotalProduct; ++i) {
            System.out.println("\n\nChoose your category.");
            System.out.println("1- Fruits");
            System.out.println("2- Poultry/Meat");
            System.out.println("3- Vegetable\n\n");
            dp.ProductCat[i] = sc.nextInt();

            // Consume the newline character left in the buffer
            sc.nextLine();

            System.out.println("Enter your product " + (i + 1) + " : ");
            dp.ProductName[i] = sc.nextLine();
            System.out.println("Enter the product ID: ");
            dp.ProductID[i] = sc.nextLine();
            System.out.print("Enter the product price per kg: RM");
            dp.ProductPrice[i] = sc.nextDouble();

            // Consume the newline character left in the buffer
            sc.nextLine();
        }

        for (int i = 0; i < dp.TotalProduct; ++i) {
            try (PrintWriter out = new PrintWriter(new FileWriter(getFileName(dp.ProductCat[i]), true))) {
                out.println("Category: " + dp.ProductCat[i]);
                out.println("Product Name: " + dp.ProductName[i]);
                out.println("Product ID: " + dp.ProductID[i]);
                out.println("Product Price: RM" + dp.ProductPrice[i] + "/kg\n");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

	System.out.println("DONE.");
    }

    // Helper method to get the filename based on the category
    private static String getFileName(int category) {
        switch (category) {
            case 1:
                return "Fruits.txt";
            case 2:
                return "Poultry_Meat.txt";
            case 3:
                return "Vegetables.txt";
            default:
                return "UnknownCategory.txt";
        }
    }
}
