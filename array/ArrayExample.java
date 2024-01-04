package array;
import java.util.*;

public class ArrayExample {

    public static void main(String[] args) {
        
        // create array
        // 1. declare -> input
        // int[] age = {12, 4, 5, 6, 7, 10, 12, 13, 9, 1};

        // 2. keyboard -> input
        int[] age= new int[3];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<age.length; i++)
        {
            System.out.println("Enter age " + (i+1) + ": ");
            age[i] = sc.nextInt();
        }

        // display data 
        System.out.println("\nAll data:");

        // accessing array
        // System.out.println("First Element:" + age[0]);
        // System.out.println("Second Element:" + age[1]);
        // System.out.println("Third Element:" + age[2]);

        // loop through array
        // 1. primitive loop
        // for (int i=0; i<age.length; i++)    // i+2 skip once
        // {
        //     System.out.println(age[i]);
        // }

        // 2. enhanced loop
        for (int a: age)    // "a" may vary
        {
            System.out.println(a);
        }
    }
    
}
