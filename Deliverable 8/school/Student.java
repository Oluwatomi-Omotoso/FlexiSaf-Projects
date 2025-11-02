package school;

public class Student extends Person implements Learner, Payable {
    private String studentId;
    private String department;

    public Student(String name, int age, String studentId, String department) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Implemented methods
    public void study() {
        System.out.println(getName() + " is studying.");
    }

    public void submitAssignment() {
        System.out.println(getName() + " submitted an assignment.");
    }

    public void takeExam() {
        System.out.println(getName() + " is taking an exam.");
    }

    public void calculatePay() {
        System.out.println(getName() + " has no salary yet.");
    }

    public void getBankDetails() {
        System.out.println(getName() + " has no bank record yet.");
    }

    public void generatePayslip() {
        System.out.println("Payslip not applicable for student.");
    }

    public void speak() { System.out.println(getName() + " says hello."); }
    public void walk() { System.out.println(getName() + " is walking."); }
    public void sleep() { System.out.println(getName() + " is sleeping."); }
}
