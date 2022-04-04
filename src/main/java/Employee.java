import java.util.Date;

public class Employee {
    private String name;
    private int employeeid;
    private int maxHours;
    private int maxActivities;
    private static int runner = 0;


    // Constructor 1
    public Employee(String name) {
        this.name = name;
        this.employeeid = this.runner;
        this.runner++;
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
