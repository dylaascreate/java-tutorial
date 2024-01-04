package array;
import java.util.*;
import java.util.ArrayList;

// data that uses categories

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String>languages= new ArrayList<>();
        languages.add("Java");  // initialize a value
        languages.add("Python");
        languages.add("Swift");
        languages.add("Pearl");
    
        ArrayList<String>database= new ArrayList<>();

        database.add("MySql");
        database.add("Visual Basic");

        System.out.println("ArrayList: " + languages);
        System.out.println("ArrayList: " + database);

        languages.set(2, "Kotlin"); // modifies existing value
        database.set(1, "Laragon");

        // after changes
        System.out.println("\n===After changes were made===");
        System.out.println("Modified ArrayList: " + languages);
        System.out.println("Modified ArrayList: " + database);

        String str= database.remove(1); // remove a value
        
        System.out.println("\n===After deletion were made===");
        System.out.println("Modified ArrayList: " + database);

    }
    
}
