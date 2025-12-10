package app.utils;

import app.models.Applicant;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.UUID;


public class ApplicantForm {

    private static Scanner sc = new Scanner(System.in);

    public static Applicant startForm() {
        while (true) {
            System.out.println("\n=== STEP 1: PERSONAL INFO ===");
            System.out.print("Full Name: ");
            String fullName = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Phone Number: ");
            String phone = sc.nextLine();


            System.out.println("\n=== STEP 2: GUARDIAN INFORMATION ===");
            System.out.print("Guardian Name: ");
            String guardianName = sc.nextLine();


            System.out.println("\n=== STEP 3: ACADEMIC INFORMATION ===");
            System.out.print("Academic Details (e.g., O-Level scores): ");
            String academicInfo = sc.nextLine();


            System.out.println("\n=== CONFIRMATION ===");
            System.out.println("Please review your entry:");

            System.out.println("\nName: " + fullName);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Guardian: " + guardianName);
            System.out.println("Academic Info: " + academicInfo);

            System.out.print("\nSubmit application? (yes/no): ");
            String confirm = sc.nextLine().trim().toLowerCase();

            if (!confirm.equals("yes")) {
                System.out.println("Application cancelled.");
                return null;
            }

            String id = generateId();

            System.out.println("Application submitted successfully! Your ID is: " + id);

            return new Applicant(id, fullName, email, phone, guardianName, academicInfo);


        }

    }

    private static String generateId() {
        return "APP-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }
}
