package school;

public class Main {
    public static void main(String[] args) {

        //Student Object
        Student student1 = new Student("Tomi", 18, "STU101", "Computer Science");
        System.out.println("** Student Details **");
        System.out.println("Name: " + student1.getName());
        System.out.println("Department: " + student1.getDepartment());
        student1.study();
        student1.submitAssignment();
        student1.takeExam();
        student1.speak();
        System.out.println();

        //Teacher Object
        Teacher teacher1 = new Teacher("Mr. Michael", 35, "EMP101", 250000, "Java Programming", 8);
        System.out.println("** Teacher Details **");
        System.out.println("Name: " + teacher1.getName());
        System.out.println("Subject: " + teacher1.getSubject());
        teacher1.teach();
        teacher1.prepareLesson();
        teacher1.gradeStudents();
        teacher1.calculatePay();
        System.out.println();

        //Janitor Object
        Janitor janitor1 = new Janitor("John", 40, "EMP102", 90000, "Night", "Laboratory Block");
        System.out.println("** Janitor Details **");
        janitor1.performDuty();
        janitor1.report();
        janitor1.calculatePay();
        System.out.println();

        //Admin Staff
        AdminStaff admin1 = new AdminStaff("Chika", 29, "EMP405", 120000, "Office B1", "Secretary");
        System.out.println("** Admin Staff Details **");
        admin1.performDuty();
        admin1.attendMeeting();
        admin1.report();
        System.out.println();

        //Subject Offer
        Subject subject1 = new Subject("CSC201", "Data Structures", 3, "Computer Science");
        System.out.println("** Subject Details **");
        System.out.println("Course Code: " + subject1.getCourseCode());
        System.out.println("Course Name: " + subject1.getCourseName());
        System.out.println("Credit Units: " + subject1.getCreditUnits());
        System.out.println("Department: " + subject1.getDepartment());
        System.out.println();


        System.out.println("✅ All objects created and methods executed successfully!");
    }
}
