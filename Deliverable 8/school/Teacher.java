package school;

public class Teacher extends Employee implements TeacherActions, Payable {
    private String subject;
    private int experienceYears;

    public Teacher(String name, int age, String employeeId, double salary, String subject, int experienceYears) {
        super(name, age, employeeId, salary);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void teach() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }

    public void gradeStudents() {
        System.out.println(getName() + " is grading students.");
    }

    public void prepareLesson() {
        System.out.println(getName() + " is preparing lessons.");
    }

    public void calculatePay() {
        System.out.println(getName() + "'s pay is " + getSalary());
    }

    public void getBankDetails() {
        System.out.println("Fetching bank details for " + getName());
    }

    public void generatePayslip() {
        System.out.println("Payslip generated for " + getName());
    }

    public void speak() { System.out.println(getName() + " speaks in class."); }
    public void walk() { System.out.println(getName() + " walks to the staff room."); }
    public void sleep() { System.out.println(getName() + " is resting."); }
}
