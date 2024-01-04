package array;
import java.util.*;

public class StudentArray1 {

    public static void main(String[] args) {

        // 3. object -> input
        Scanner sc = new Scanner(System.in);
        Student[] stdList = new Student[5]; // reference variable

        // Loop through array to populate it with user input
        for (int i = 0; i < stdList.length; i++) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Cpa: ");
            double cpa = sc.nextDouble();
            
            // Consume the newline character after reading the double value
            sc.nextLine();
            
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            // Consume the newline character after reading the int value
            sc.nextLine();

            // Create a Student object and store it in the array
            stdList[i] = new Student(name, cpa, age);
        }

        // Loop to print the array elements
        for (int i = 0; i < stdList.length; i++) {
            System.out.println(stdList[i]);
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}

// Student class definition
class Student {
    String name;
    double cpa;
    int age;

    // Constructor
    public Student(String name, double cpa, int age) {
        this.name = name;
        this.cpa = cpa;
        this.age = age;
    }

    public String toString() {
        return "Student {name=" + name + ", cpa=" + cpa + ", age=" + age + '}';
    }
}
