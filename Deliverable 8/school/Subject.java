package school;

public class Subject extends Course {
    private int creditUnits;
    private String department;

    public Subject(String courseCode, String courseName, int creditUnits, String department) {
        super(courseCode, courseName);
        this.creditUnits = creditUnits;
        this.department = department;
    }

    public int getCreditUnits() {
        return creditUnits;
    }

    public void setCreditUnits(int creditUnits) {
        this.creditUnits = creditUnits;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
