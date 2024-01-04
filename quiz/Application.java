import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ApplicantValidator {

    // Constructor
    public ApplicantValidator() {}

    static boolean isValid(int age, double weight, String gender, String medHistory, String it, String license, String qualification, int workExp) {
        if (gender.equals("men")) {
            return age < 30 && weight >= 50 && weight <= 70 && medHistory.equalsIgnoreCase("n") && it.equalsIgnoreCase("y")
                    && license.equalsIgnoreCase("y") && (qualification.equalsIgnoreCase("diploma") || qualification.equalsIgnoreCase("degree"))
                    && workExp > 5;
        } else if (gender.equals("women")) {
            return age < 27 && weight >= 50 && weight <= 60 && medHistory.equalsIgnoreCase("n") && it.equalsIgnoreCase("y")
                    && license.equalsIgnoreCase("y") && (qualification.equalsIgnoreCase("diploma") || qualification.equalsIgnoreCase("degree"))
                    && workExp > 5;
        }
        return false;
    }

    static boolean isReserveCandidate(int age, double weight, String gender, String medHistory, String it, String license, String qualification, int workExp) {
        if (gender.equals("men")) {
            return age >= 31 && age <= 33 && weight >= 55 && weight <= 75 && medHistory.equalsIgnoreCase("n")
                    && (it.equalsIgnoreCase("n") || it.equalsIgnoreCase("y")) && (license.equalsIgnoreCase("n") || license.equalsIgnoreCase("y"))
                    && (qualification.equalsIgnoreCase("spm") || qualification.equalsIgnoreCase("cert") || qualification.equalsIgnoreCase("diploma") || qualification.equalsIgnoreCase("degree"))
                    && workExp < 5;
        } else if (gender.equals("women")) {
            return age >= 28 && age <= 30 && weight >= 52 && weight <= 60 && medHistory.equalsIgnoreCase("n")
                    && (it.equalsIgnoreCase("n") || it.equalsIgnoreCase("y")) && (license.equalsIgnoreCase("n") || license.equalsIgnoreCase("y"))
                    && (qualification.equalsIgnoreCase("spm") || qualification.equalsIgnoreCase("cert") || qualification.equalsIgnoreCase("diploma") || qualification.equalsIgnoreCase("degree"))
                    && workExp < 5;
        }
        return false;
    }

    static boolean isNonEligibleCandidate(int age, double weight, String gender, String medHistory, String it, String license, String qualification, int workExp) {
    if (gender.equals("men")) {
        return age > 34 && weight > 76 && medHistory.equalsIgnoreCase("y") &&
                it.equalsIgnoreCase("n") && license.equalsIgnoreCase("n") &&
                qualification.equalsIgnoreCase("n") && workExp == 0;
    } else if (gender.equals("women")) {
        return age > 31 && weight > 60 && medHistory.equalsIgnoreCase("y") &&
                it.equalsIgnoreCase("n") && license.equalsIgnoreCase("n") &&
                qualification.equalsIgnoreCase("n") && workExp == 0;
    }
    return false;
}

    
}

class Application {

    String Name, Gender, MedHis, IT, License, Qualification;
    double Weight;
    int Age, WorkExp;

    // Constructor
    public Application(){
        Scanner sc= new Scanner(System.in);

        System.out.println("=== Recruitment application ===");
        System.out.print("\nName: ");
        Name= sc.nextLine();
        System.out.print("Age: ");
        Age= sc.nextInt();
        sc.nextLine();
        System.out.print("Gender (men/women): ");
        Gender= sc.nextLine();
        System.out.print("Weight: ");
        Weight= sc.nextDouble();
        System.out.print("Medical History (y/n): ");
        MedHis= sc.next();
        System.out.print("IT literate (y/n): ");
        IT= sc.next();
        System.out.print("Car/Motor License (y/n): ");
        License= sc.next();
        System.out.print("Qualification (spm/cert/dip/deg): ");
        Qualification= sc.next();
        System.out.print("Working Experience (years): ");
        WorkExp= sc.nextInt();
    } 

    void WriteToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("FileApplicant.txt"));
         PrintWriter reserveWriter = new PrintWriter(new FileWriter("Reserve.txt"));
         PrintWriter nonEligibleWriter = new PrintWriter(new FileWriter("NonEligible.txt")))
    {
            writer.write("All Candidate:\n");
            writer.println("Name: " + Name);
            writer.println("Age: " + Age);
            writer.println("Weight: " + Weight);
            writer.println("Medical History: " + MedHis);
            writer.println("IT literate: " + IT);
            writer.println("Car/Motor License: " + License);
            writer.println("Qualification: " + Qualification);
            writer.println("Working Experience: " + WorkExp + " years");

            boolean isReserveCandidate = ApplicantValidator.isReserveCandidate(Age, Weight, Gender, MedHis, IT, License, Qualification, WorkExp);
            if (isReserveCandidate) {
            reserveWriter.write("Reserve Candidate:\n");
            reserveWriter.println("Name: " + Name);
            reserveWriter.println("Age: " + Age);
            reserveWriter.println("Weight: " + Weight);
            reserveWriter.println("Medical History: " + MedHis);
            reserveWriter.println("IT literate: " + IT);
            reserveWriter.println("Car/Motor License: " + License);
            reserveWriter.println("Qualification: " + Qualification);
            reserveWriter.println("Working Experience: " + WorkExp + " years");
        }

            boolean isNonEligibleCandidate = ApplicantValidator.isNonEligibleCandidate(Age, Weight, Gender, MedHis, IT, License, Qualification, WorkExp);
            if (isNonEligibleCandidate) {
            nonEligibleWriter.write("Non-Eligible Candidate:\n");
            nonEligibleWriter.println("Name: " + Name);
            nonEligibleWriter.println("Age: " + Age);
            nonEligibleWriter.println("Weight: " + Weight);
            nonEligibleWriter.println("IT literate: " + IT);
            nonEligibleWriter.println("Car/Motor License: " + License);
            nonEligibleWriter.println("Qualification: " + Qualification);
            nonEligibleWriter.println("Working Experience: " + WorkExp + " years");
        }
        
            boolean isValidApplicant = ApplicantValidator.isValid(Age, Weight, Gender, MedHis, IT, License, Qualification, WorkExp);
            if (isValidApplicant) {
            System.out.println("\nApplicant meets the specified criteria.");
            } else {
            System.out.println("\nApplicant does not meet the specified criteria.");
            }

        System.out.println("Data written to FileApplicant.txt successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred while writing to the file.");
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        // reference constructor
        Application app = new Application();
        app.WriteToFile();
    }
    
}
