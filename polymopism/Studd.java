// keyword this
// date 17/01/2024

import java.util.Scanner;

class Studd {
     String name;
     int matricID;
     String university;

     Studd () {};
      
     public String toString() {
        return name+" "+matricID+" "+university;
     }
     
     public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        Studd s1 = new Studd ();
        Studd s2 = new Studd ();
         
        for (int i=0; i<2; i++) {
            System.out.println("Insert name: ");
            s1.name = sc.nextLine();
            System.out.println("Insert matric number: ");
            s1.matricID = sc.nextInt();
            sc.nextLine();
            System.out.println("Insert university name: ");
            s1.university = sc.nextLine();
        }

        for (int i=0; i<2; i++) {
            System.out.println("Name: " +s1.name);
            System.out.println("Matric ID: " +s1.matricID);
            System.out.println("University name: " +s1.university);
        }

       
     }
}

