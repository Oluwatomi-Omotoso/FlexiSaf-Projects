package school;

public class AdminStaff extends Employee implements StaffDuties {
    private String office;
    private String role;

    public AdminStaff(String name, int age, String employeeId, double salary, String office, String role) {
        super(name, age, employeeId, salary);
        this.office = office;
        this.role = role;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void performDuty() {
        System.out.println(getName() + " is performing administrative duties.");
    }

    public void attendMeeting() {
        System.out.println(getName() + " is attending a management meeting.");
    }

    public void report() {
        System.out.println(getName() + " is submitting a report.");
    }

    public void speak() { System.out.println(getName() + " is talking to a visitor."); }
    public void walk() { System.out.println(getName() + " walks to office " + office); }
    public void sleep() { System.out.println(getName() + " is at rest."); }
}
