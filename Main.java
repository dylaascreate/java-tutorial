import java.io.FileWriter;
import java.io.IOException;

class Product {
    private String name;
    private String id;
    private double pricePerKg;

    public Product(String name, String id, double pricePerKg) {
        this.name = name;
        this.id = id;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }
}

class Shop {
    private String category;
    private String fileName;

    public Shop(String category, String fileName) {
        this.category = category;
        this.fileName = fileName;
    }

    public void registerProduct(Product product) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String line = String.format("%s,%s,%.2f%n", product.getId(), product.getName(), product.getPricePerKg());
            writer.write(line);
            System.out.println("Product registered successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Registering products for the Fruits category
        Shop fruitsShop = new Shop("Fruits", "fruits.txt");
        for (int i = 1; i <= 5; i++) {
            Product fruit = new Product("Fruit" + i, "F" + i, 2.5 + i);
            fruitsShop.registerProduct(fruit);
        }

        // Registering products for the Poultry/Meat category
        Shop poultryMeatShop = new Shop("Poultry/Meat", "poultry_meat.txt");
        for (int i = 1; i <= 5; i++) {
            Product poultryMeat = new Product("Poultry/Meat" + i, "PM" + i, 5.0 + i);
            poultryMeatShop.registerProduct(poultryMeat);
        }

        // Registering products for the Vegetables category
        Shop vegetablesShop = new Shop("Vegetables", "vegetables.txt");
        for (int i = 1; i <= 5; i++) {
            Product vegetable = new Product("Vegetable" + i, "V" + i, 1.0 + i);
            vegetablesShop.registerProduct(vegetable);
        }
    }
}
