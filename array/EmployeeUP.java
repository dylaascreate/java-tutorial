package array;
import java.util.*;
// single inheritence

class EmployerUP {
    String name;
    Scanner sc= new Scanner(System.in);

    void RegisterEmployer () {
        System.out.println ("Enter Employer name= ");
        name= sc.nextLine();
    }

    void Status() {System.out.println("Status: Employee of the year!");}
}

class EmployeeUP extends EmployerUP { // inheritence
    String empName;
    String department;
    float salary;

    void RegisterEmployee () {
    Scanner sc= new Scanner(System.in);

        System.out.println ("Enter Employee name= ");
        empName= sc.nextLine();
        System.out.println ("Enter Employer department= ");
        department= sc.nextLine();
        System.out.println ("Enter Employer salary= ");
        salary= sc.nextFloat();
    }

    public static void main (String[]args) {
        EmployeeUP emp= new EmployeeUP();

        emp.RegisterEmployer();
        emp.RegisterEmployee();

        System.out.println("Employer name: " + emp.name);
        emp.Status();
        System.out.println("Employee name: " + emp.empName);
        System.out.println("Employee department: " + emp.department);
        System.out.println("Employee salary: " + emp.salary);
    }
}
