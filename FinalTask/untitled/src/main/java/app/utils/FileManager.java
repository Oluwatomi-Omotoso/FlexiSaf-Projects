package app.utils;

import app.models.Applicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    private static final String FILE_NAME = "applicants.txt";

    //Save applicants
    public static void saveApplicant(Applicant a) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(a.getId() + "|" +
                    a.getFullName() + "|" +
                    a.getEmail() + "|" +
                    a.getPhone() + "|" +
                    a.getGuardianName() + "|" +
                    a.getAcademicInfo() + "|" +
                    a.getStatus() + "\n"
            );
        } catch (IOException e) {
            System.out.println("Error saving applicant: " + e.getMessage());
        }
    }


    //Find applicants
    public static Applicant findApplicantById(String searchId) {

        try (java.util.Scanner fileScanner = new java.util.Scanner(new java.io.File(FILE_NAME))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split("\\|");

                if (data[0].equalsIgnoreCase(searchId)) {
                    // Convert line back to an Applicant object
                    Applicant a = new Applicant(
                            data[0],   // ID
                            data[1],   // Name
                            data[2],   // Email
                            data[3],   // Phone
                            data[4],   // Guardian
                            data[5]    // Academic Info
                    );
                    a.setStatus(data[6]);
                    return a;
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return null;
    }



    //Load applicants
     public static java.util.List<Applicant> loadAllApplicants(){
        java.util.List<Applicant> list = new java.util.ArrayList<>(); //This serves as the list holding all the applicants.

         //Try scanning for the filename.
        try(java.util.Scanner fileScanner = new java.util.Scanner(new java.io.File(FILE_NAME))){
            //if it exists split up the details into lines, specifying a line to end when the filescanner encounters "\|"
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] data = line.split("\\|");
                Applicant applicant = new Applicant(data[0],data[1],data[2],data[3],data[4],data[5]);
                applicant.setStatus(data[6]);
                System.out.println(applicant.toString());
                list.add(applicant);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error loading applicants: "+e.getMessage());
        }
        return list;
     }

     //Update specific applicant
    public static void updateApplicant(Applicant updatedApplicant){
        List<Applicant> all = loadAllApplicants();

        try(FileWriter writer = new FileWriter(FILE_NAME)){
            for(Applicant applicant : all){
                if(applicant.getId().equals(updatedApplicant.getId())){
                    applicant = updatedApplicant;
                }
                writer.write(applicant.getId()+"|"+applicant.getFullName()+"|"+applicant.getEmail()+"|"+applicant.getPhone()+"|"+applicant.getGuardianName()+"|"+applicant.getAcademicInfo()+"|"+applicant.getStatus()+"\n");
            }
        }catch(Exception e){
            System.out.println("Error updating applicant: "+e.getMessage());
        }
    }
}
