package school;

public class Janitor extends Employee implements StaffDuties, Payable {
    private String shift;
    private String areaAssigned;

    public Janitor(String name, int age, String employeeId, double salary, String shift, String areaAssigned) {
        super(name, age, employeeId, salary);
        this.shift = shift;
        this.areaAssigned = areaAssigned;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getAreaAssigned() {
        return areaAssigned;
    }

    public void setAreaAssigned(String areaAssigned) {
        this.areaAssigned = areaAssigned;
    }

    public void performDuty() {
        System.out.println(getName() + " is cleaning " + areaAssigned);
    }

    public void attendMeeting() {
        System.out.println(getName() + " attends maintenance meeting.");
    }

    public void report() {
        System.out.println(getName() + " reports to the supervisor.");
    }

    public void calculatePay() {
        System.out.println(getName() + " earns " + getSalary());
    }

    public void getBankDetails() {
        System.out.println("Fetching " + getName() + "'s bank details.");
    }

    public void generatePayslip() {
        System.out.println("Payslip generated for " + getName());
    }

    public void speak() { System.out.println(getName() + " greets staff politely."); }
    public void walk() { System.out.println(getName() + " is walking down the hall."); }
    public void sleep() { System.out.println(getName() + " is resting after shift."); }
}
