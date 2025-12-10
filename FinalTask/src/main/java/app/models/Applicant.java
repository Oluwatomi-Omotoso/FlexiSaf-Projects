package app.models;

public class Applicant {
    private String id;
    private String fullName;
    private String email;
    private String phone;
    private String guardianName;
    private String academicInfo;
    private String status;

    public Applicant(String id, String fullName, String email, String phone, String guardianName, String academicInfo) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.guardianName = guardianName;
        this.academicInfo = academicInfo;
        this.status = "Pending";
    }

//    Getters
    public String getId(){return id;}
    public String getFullName(){return fullName;}
    public String getEmail(){return email;}
    public String getPhone(){return phone;}
    public String getGuardianName(){return guardianName;}
    public String getAcademicInfo(){return academicInfo;}
    public String getStatus(){return status;}

//   Setters
    public void setStatus(String status){this.status = status;
    }

    @Override
    public String toString() {
        return "\n--- Applicant ---" +
                "\nID: " + id +
                "\nName: " + fullName +
                "\nEmail: " + email +
                "\nPhone: " + phone +
                "\nGuardian: " + guardianName +
                "\nAcademics: " + academicInfo +
                "\nStatus: " + status +
                "\n------------------\n";
    }
}
