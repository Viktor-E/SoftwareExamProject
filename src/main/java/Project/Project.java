package Project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Project {

    protected static ArrayList<Project> projects = new ArrayList<Project>();

    //løbs nummer
    Date d=new Date();
    int year=d.getYear();
    int currentYear=(year-100)*1000;
    private static int runner = 0;

    private Activity.ActivityType type;
    private String name;
    private static Date startDate;
    private Date endDate;
    private int projektnummre = 0;
    private Employee projectManager;
    protected ArrayList<Activity> activities;

    //TODO : make sure NULL doesn't crash
    public Project(String name) {
        this.name = name;
        this.startDate = null;
        this.endDate = null;
        this.projektnummre = currentYear+this.runner;
        this.projectManager = null;
        this.activities = new ArrayList<Activity>();
    }

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = null;
        this.endDate = null;
        this.projektnummre = currentYear+this.runner;
        this.projectManager = null;
        this.activities = null;
    }

    //function for creating project
    public static void createProject(String name) {
        if(name == "exit") {
            System.out.println("Name can't be exit");
            return;
        }
        Project Project1 = new Project(name);
        runner++;
        projects.add(Project1);
    }

    //add activtiy to a project
    //TODO user has to be project lead
    public void addActivty(String name1, Activity.ActivityType type1, Date date1, Date date2) throws ParseException {
            activities.add(Activity.createActivity(name1, type1, date1, date2,false));
    }

    public void addActivty2(String name1, Activity.ActivityType type1) throws ParseException {
        activities.add(Activity.createActivity2(name1, type1,false));
    }

    public void setProjectManager(Employee user){
        this.projectManager = user;
    }


    public static Project findProject(String projectName) {
            for(int i = 0; i < projects.size(); i++) {
                if(projects.get(i).getName().equals(projectName)) {
                    return projects.get(i);
                }
            }
        return null;
    }

    public String getName() {
        return name;
    }

    public Employee getProjectManager(){
        return projectManager;
    }

    //list all projects
    public static void printProjects() {
        for(int i = 0; i < projects.size(); i++) {
            System.out.println("Project Name: " + projects.get(i).name);
            if(projects.get(i).projectManager == null) {
                System.out.println("project has no lead");
                System.out.println("-----------------------------------");
            } else {
                System.out.println("Project manager: " + projects.get(i).projectManager.getName());
                System.out.println("-----------------------------------");
            }
        }
    }

    public static void printProjectsWithoutLead() {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).projectManager == null) {
                System.out.println(projects.get(i).name);
            }
        }
    }


    public static void listAssignedActivities(Employee user){
        for(int l = 0; l < Activity.getActivitiis().size(); l++) {
            System.out.println(Activity.getActivitiis().get(l).getName());
        }

        for(int i = 0; i < projects.size(); i++) {
            for(int h = 0; h < projects.get(i).activities.size(); h++) {
                for(int g = 0; g < projects.get(i).activities.get(h).getAssignedUsers().size(); g++)
                if(Objects.equals(projects.get(i).activities.get(h).getAssignedUsers().get(g), user)) {
                    System.out.println(projects.get(i).activities.get(h).getName());
                }
            }
        }
    }

    public static Activity findActivityInProjects(String name){
        for(int i = 0; i < projects.size(); i++) {
            for(int h = 0; h < projects.get(i).activities.size(); h++) {
                    if(projects.get(i).activities.get(h).getName()==name) {
                        return projects.get(i).activities.get(h);
                }
            }
        }
        return null;
    }

    public Activity findActivity(String name) {
            for(int h = 0; h < activities.size(); h++) {
                if(activities.get(h).getName().equals(name)) {
                    return activities.get(h);
                }
            }
        return null;
    }

    public void listActivities() {
        System.out.println("Info for project: " + name);
        System.out.println("Start date: " + startDate + " " + "End date: " + endDate);
        System.out.println("Project Number: " + projektnummre);
        System.out.println("-----------------------------------");
        System.out.println("Activity info: ");
        System.out.println("-----------------------------------");
        if(activities.size() == 0) {
            System.out.println("Project has no activities \n");
        }
        for(int i = 0; i < activities.size(); i++) {
            System.out.println("Activity name: " + activities.get(i).getActivityName());
            System.out.println("Activity type: " + activities.get(i).getActivityType());
            System.out.println("Estimated time: " + activities.get(i).getEstimatedTime());
            System.out.println("Start date: " + activities.get(i).getStartDate());
            System.out.println("End date: " + activities.get(i).getEndDate());
            System.out.println("-----------------------------------"  + "\n");
        }
    }



}
