import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class NameFile {
    String fileName;
    String userInput;

    NameFile() {
        // Default constructor
    }

    void setFileName() {
        // Set the file name based on user input
        switch (userInput) {
            case "1":
                fileName = "fruits.txt";
                break;
            case "2":
                fileName = "poultry_meat.txt";
                break;
            case "3":
                fileName = "vegetables.txt";
                break;
            default:
                fileName = ""; // Handle the default case appropriately
        }
    }
}

public class ReadProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameFile nf = new NameFile();

        System.out.println("Do you want to read all files or just one?");
	System.out.println("Enter 'all' or choose a number.");
	System.out.println("\n1-Fruits \n2-Poultry/Meat \n3-Vegetables");
        nf.userInput = sc.nextLine();

        nf.setFileName(); // Set the file name based on user input

        // Locate the file(s) based on user input
        String[] fileNames;
        if ("all".equalsIgnoreCase(nf.userInput)) {
            fileNames = new String[]{"C://java/fruits.txt", "C://java/poultry_meat.txt", "C://java/vegetables.txt"};
        } else {
            fileNames = new String[]{nf.fileName};
        }

        // Read and display the content of the file(s)
        for (String fileName : fileNames) {
            try {
                FileReader fileReader = new FileReader(fileName); // Use fileName instead of nf.fileName
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();
            } catch (IOException ex) {
                System.out.println("Error reading file " + fileName + ": " + ex.getMessage());
            }
        }
    }
}
