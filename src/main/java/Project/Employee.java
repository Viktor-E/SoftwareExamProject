package Project;

import java.util.ArrayList;
import java.util.Date;

// Viktor
public class Employee {
    private String name;
    private int maxMinutes;
    private int maxActivities;
    private ArrayList<RegistrationContainer> timeRegistrationContainers;

    // Constructor
    public Employee(String name) {
        this.name = name;
        this.maxMinutes = 480;
        this.maxActivities = 20;
        this.timeRegistrationContainers = new ArrayList<RegistrationContainer>();
    }

    //get and setter functions
    public void setName(String name) {
        if (helpclass.validateNameLength(name)) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    //function for making a timeRegistrationContainer
    public void registerTime(Date date, Activity activity, int worktime) {
        for (int i = 0; i < timeRegistrationContainers.size(); i++) {
            if (timeRegistrationContainers.get(i).getDate().equals(date)) {
                timeRegistrationContainers.get(i).addRegistration(new TimeRegistration(activity, worktime));
                return;
            }
        }
        //if it doesn't find the date
        timeRegistrationContainers.add(new RegistrationContainer(date));
        timeRegistrationContainers.get(timeRegistrationContainers.size() - 1).addRegistration(new TimeRegistration(activity, worktime));
    }

    //print time registation for a given date
    public void timeRegistations(Date date) {
        for (int i = 0; i < timeRegistrationContainers.size(); i++) {
            if (timeRegistrationContainers.get(i).getDate().equals(date)) {
                for (int h = 0; h < timeRegistrationContainers.get(i).getTimeRegistration().size(); h++) {
                    System.out.print("user: " + getName() + " has worked : " + timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedTime() + " minutes on ");
                    System.out.println("activity: " + timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedActivity().getName());
                }
            }
        }
    }

    public int getMaxMinutes() {
        return maxMinutes;
    }

    public int getMaxActivities() {
        return maxActivities;
    }

    public ArrayList<RegistrationContainer> getTimesRegistrationContainer() {
        return timeRegistrationContainers;
    }

    public int remainingHours(Date date) {
        int count = 0;
        for (int i = 0; i < timeRegistrationContainers.size(); i++) {
            if (timeRegistrationContainers.get(i).getDate().equals(date)) {
                for (int h = 0; h < timeRegistrationContainers.get(i).getTimeRegistration().size(); h++) {
                    count = count + timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedTime();
                }
            }
        }
        return count;
    }

}
