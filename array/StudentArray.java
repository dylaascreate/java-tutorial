package array;
import java.util.*;

public class StudentArray {

    public static void main(String[] args) {

        // 3. object -> input
        Scanner sc = new Scanner(System.in);
        Student[] stdList = new Student[5]; // reference variable

        // Loop through array to populate it with user input
        for (int i = 0; i < stdList.length; i++) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Cpa: ");
            double cpa = sc.nextDouble();            
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            stdList[i] = new Student(name, cpa, age);
        }
            for (int i=0; i< stdList.length; i++)
            {
                System.out.println(stdList[i].name);
                System.out.println(stdList[i].cpa);
                System.out.println(stdList[i].age);
            }
        
    }
}