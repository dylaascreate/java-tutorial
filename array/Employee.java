package array;
// single inheritence

class Employer {
    String name= "Ali";

    void Status() {System.out.println("Status: Employee of the year!");}
}

class Employee extends Employer { // inheritence
    String empName= "Ahmad";
    String department= "IT";
    float salary= 4000;

    public static void main (String[]args) {
        Employee emp= new Employee();

        System.out.println("Employer name: " + emp.name);
        emp.Status();
        System.out.println("Employee name: " + emp.empName);
        System.out.println("Employee department: " + emp.department);
        System.out.println("Employee salary: " + emp.salary);
    }

    public void RegisterEmployee() {
    }
}
