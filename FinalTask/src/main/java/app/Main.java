package app;
import app.models.Applicant;
import app.utils.ApplicantForm;
import app.utils.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

   private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loopQuestions = true;
        System.out.println("Welcome to the Applicant Intake System!");
        while (true) {
            showMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                //Add new applicant
                case 1:
                    while(loopQuestions) {
                        Applicant newApp = ApplicantForm.startForm();
                        if (newApp != null) {
                            System.out.println(newApp.toString());
                            FileManager.saveApplicant(newApp);
                            System.out.println("Applicant saved to file.");
                        }
                        System.out.println("Would you like to enter a new applicant? (Y/N)");
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("n")) {
                            break;
                        } else if (answer.equalsIgnoreCase("y")) {
                            loopQuestions = true;
                        }


                    }
                    break;
                //Search for applicant by ID
                case 2:
                    System.out.println("Enter Applicant ID to search: ");
                    String searchId = sc.nextLine();
                    Applicant found = FileManager.findApplicantById(searchId);

                    if (found != null) {
                        System.out.println("\nApplicant found");
                        System.out.println(found.toString());

                    }else{
                        System.out.println("No applicant found with ID: "+  searchId);
                    }
                    break;
                //List all the applicants
                case 3:
                    System.out.println("Here's all the applicants: ");
                    try {
                        Scanner fileReader = new Scanner(new File("applicants.txt"));
                        System.out.println("\n=== Applicants in File ===");

                        while (fileReader.hasNextLine()) {
                            String line = fileReader.nextLine();
                            System.out.println(line);
                        }

                        fileReader.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("No saved applicants found.");
                    }

                    break;

                case 4:
                    System.out.println("Enter Applicant ID to review: ");
                    String IdToReview = sc.nextLine();
                    Applicant toReview = FileManager.findApplicantById(IdToReview);
                    if(toReview == null){
                        System.out.println("No applicant found with ID: "+  IdToReview);
                        break;
                    }
                    System.out.println("\nApplicant details: ");
                    System.out.println(toReview.toString());
                    System.out.println("\nChoose action: ");
                    System.out.println("1. Accept applicant");
                    System.out.println("2. Reject applicant");
                    System.out.println("Enter choice: ");
                    String action = sc.nextLine();

                    //Actions to take based of reviewer.
                    if(action.equals("1")){
                        toReview.setStatus("Accepted");FileManager.updateApplicant(toReview);
                        System.out.println("Applicant marked as Accepted.");
                    }
                    else if(action.equals("2")){
                        toReview.setStatus("Rejected");
                        FileManager.updateApplicant(toReview);
                        System.out.println("Applicant marked as Rejected.");
                    }
                    else{
                        System.out.println("Invalid action.");
                    }
                    break;


                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Add new applicant");
        System.out.println("2. Search for applicant");
        System.out.println("3. List all Applicants");
        System.out.println("4. Reviewer Mode");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }
    private static int getUserChoice() {
        try{
            return Integer.parseInt(sc.nextLine());
        }catch (Exception e) {
            return -1;
        }
    }
}
