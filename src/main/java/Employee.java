import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private String name;
    private int employeeid;
    private int maxHours;
    private int maxActivities;
    private ArrayList<RegistrationContainer> timeRegistrationContainers;



    // Constructor 1
    public Employee(String name, int ID) {
        this.name = name;
        this.employeeid = ID;
        this.maxHours = 0;
        this.maxActivities = 20;
        this.timeRegistrationContainers = new ArrayList<RegistrationContainer>();
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

    public void registerTime(Date date, Activity activity,int worktime){
        for(int i = 0; i < timeRegistrationContainers.size(); i++) {
            if (timeRegistrationContainers.get(i).getDate().equals(date)) {
                timeRegistrationContainers.get(i).addRegistration(new TimeRegistration(activity, worktime));
                return;
            }
        }
        //if it doesn't find the date
        timeRegistrationContainers.add(new RegistrationContainer(date));
        timeRegistrationContainers.get(timeRegistrationContainers.size()-1).addRegistration(new TimeRegistration(activity, worktime));
    }

    public void timeRegistations(Date date) {
        for(int i = 0; i <timeRegistrationContainers.size(); i++) {
            if (timeRegistrationContainers.get(i).getDate().equals(date)) {
                for(int h = 0; h < timeRegistrationContainers.get(i).getTimeRegistration().size(); h++) {
                    System.out.println(timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedTime());
                    System.out.println(timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedActivity().getName());
                }
            }
        }
    }





}
