import java.util.Date;

public class Employee {
    private String name;
    private int employeeid;
    private int maxHours;
    private int maxActivities;


    // Constructor 1
    public Employee(String name, int ID) {
        this.name = name;
        this.employeeid = ID;
        this.maxHours = 0;
        this.maxActivities = 20;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;

    }



}
