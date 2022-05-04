package Project;

import java.util.ArrayList;
import java.util.Date;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Employee {
    private String name;
    private int employeeid;
    private int maxHours;
    private int maxActivities;
    private ArrayList<RegistrationContainer> timeRegistrationContainers;

    // Constructor
    public Employee(String name, int ID) {
        this.name = name;
        this.employeeid = ID;
        this.maxHours = 0;
        this.maxActivities = 20;
        this.timeRegistrationContainers = new ArrayList<RegistrationContainer>();
    }

    //get and setter functions
    public void setName(String name) {
        if(helpclass.validateNameLength(name)) {
            this.name = name;
        }
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

    //function for making a timeRegistrationContainer
    public void registerTime(Date date, Activity activity, int worktime){
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

    //print time registation for a given date
    public void timeRegistations(Date date) {
        for(int i = 0; i <timeRegistrationContainers.size(); i++) {
            if (timeRegistrationContainers.get(i).getDate().equals(date)) {
                for(int h = 0; h < timeRegistrationContainers.get(i).getTimeRegistration().size(); h++) {
                    System.out.print("user: " + getName() + " has worked :" + timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedTime() + " hours on ");
                    System.out.println("activity: " + timeRegistrationContainers.get(i).getTimeRegistration().get(h).getWorkedActivity().getName());
                }
            }
        }
    }

    public ArrayList<RegistrationContainer> getTimesRegistrationContainer(){
        return timeRegistrationContainers;
    }





}
