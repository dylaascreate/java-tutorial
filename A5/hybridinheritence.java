package A5;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Faculty {
    String FacultyName;

    void inputFacultyData(Scanner scanner) {
        System.out.println("Enter Faculty Name:");
        FacultyName = scanner.nextLine();
        // Consume the newline character
        scanner.nextLine();
    }
}

class Lecturer extends Faculty implements Course, Verify {
    String LecturerName, LecturerID;

    void inputLecturerData(Scanner scanner) {
        System.out.println("\n===LECTURER====");
        System.out.println("Enter Lecturer Name:");
        LecturerName = scanner.nextLine();
        System.out.println("Enter Lecturer ID:");
        LecturerID = scanner.nextLine();
    }

    // implement from Verify
    public void AddSubject(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verifyAddSubject'");
    }

    public void registerCourse(Scanner scanner) {
        String CourseName;
        String CourseCode;

        System.out.println("\n===DETAILS COURSE====");
        System.out.println("Enter Course Name:");
        CourseName = scanner.nextLine();
        System.out.println("Enter Course Code:");
        CourseCode = scanner.nextLine();
    }

    public void verifyAddSubject(Registration r, Scanner scanner) {
        // Ask user to verify the added subjects
        int verifyOption = JOptionPane.showConfirmDialog(null,
        "Do you want to verify the addition of subjects?\n" + r.subjectList, "Verification", JOptionPane.YES_NO_OPTION);
    
        if (verifyOption == JOptionPane.YES_OPTION) {
            // User clicked "Yes", display added list
            JOptionPane.showMessageDialog(null, "Added subject: " + r.subjectList);
        } else {
            // User clicked "No"
            JOptionPane.showMessageDialog(null, "Subjects not verified.");
        }
    }
}

class Student extends Faculty {
    String StudentName, MatricID;

    void inputStudentData(Scanner scanner) {
        System.out.println("\n===STUDENT====");
        System.out.println("Enter Student Name:");
        StudentName = scanner.nextLine();
        System.out.println("Enter Matric ID:");
        MatricID = scanner.nextLine();
    }
}

interface Course {
    void registerCourse(Scanner scanner);
}

interface Verify {
    void AddSubject(Scanner scanner);
    void verifyAddSubject(Registration r, Scanner scanner);
}

class Registration extends Student implements Verify {
    int NoCourse, Semester;
    String Group;

    String subject;
    int totalSubject;

    List<String> subjectList = new ArrayList<>();

    void DropSubject(Scanner scanner) {
        System.out.println("\nDo you want to delete a subject? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            if (!subjectList.isEmpty()) {
                System.out.println("\n===DROP SUBJECT====");
                System.out.println("Enter the subject to delete:");
                String subjectToDelete = scanner.nextLine();

                if (subjectList.contains(subjectToDelete)) {
                    subjectList.remove(subjectToDelete);
                    System.out.println("\n===After deletion was made===");
                    System.out.println("Latest added list: " + subjectList);
                    System.out.println("Removed subject: " + subjectToDelete);
                } else {
                    System.out.println("Subject not found in the list.");
                }
            } else {
                System.out.println("No subjects to delete.");
            }
        } else {
            System.out.println("Not deleting any subjects.");
        }
    }

    public void register(Scanner scanner) {
        System.out.println("\n===REGISTRATION====");
        System.out.println("Enter Number of Courses:");
        NoCourse = scanner.nextInt();

        System.out.println("Enter Semester:");
        Semester = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Group:");
        Group = scanner.nextLine();
    }

    // implement from Verify
    public void AddSubject(Scanner scanner) {
        System.out.println("\nDo you want to add subjects? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("\n===ADD SUBJECT====");
            System.out.println("Enter total subject to add:");
            totalSubject = scanner.nextInt();

            // Consume the newline character
            scanner.nextLine();

            for (int i = 0; i < totalSubject; i++) {
                System.out.println("Enter subject to add:");
                subject = scanner.nextLine();
                subjectList.add(subject);
            }
            JOptionPane.showMessageDialog(null, "Added subject: " + subjectList);
        } else {
            System.out.println("Not adding any subjects.");
        }
    }

    public void verifyAddSubject(Registration r, Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verifyAddSubject'");
    }
}

public class hybridinheritence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registration r = new Registration();

        Lecturer l = new Lecturer();
        Student s = new Student();

        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Lecturer");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    l.inputFacultyData(scanner);
                    l.inputLecturerData(scanner);
                    l.registerCourse(scanner);
                    l.verifyAddSubject(r, scanner);
                    break;
                case 2:
                    s.inputFacultyData(scanner);
                    s.inputStudentData(scanner);

                    r.register(scanner);
                    r.AddSubject(scanner);
                    r.DropSubject(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        scanner.close();

        // write into file adddrop.txt
        try (PrintWriter out= new PrintWriter((new FileWriter("adddrop.txt"))))
        {
            out.println("\n===LECTURER====");
            out.println("Lecturer Name: " + l.LecturerName);
            out.println("Lecturer ID: " + l.LecturerID);
            out.println("------------------------");
            out.println("\n===STUDENT====");
            out.println("Student Name: " + s.StudentName);
            out.println("Matric ID: " + s.MatricID);
            out.println("No. course: " + r.NoCourse);
            out.println("Semester: " + r.Semester);
            out.println("Group: " + r.Group);
            out.println("Subject list: " + r.subjectList);
            out.println("------------------------");

            System.out.println("\nSuccessfully restore data in file.\n");
            out.close();
        } 
        catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
