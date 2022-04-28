import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Project {

    private static ArrayList<Project> projects = new ArrayList<Project>();

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
    private ArrayList<Activity> activities;

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
        Project Procject1 = new Project(name);
        projects.add(Procject1);
    }

    //add activtiy to a project
    //TODO user has to be project lead
    public void addActivty(Employee user1, String name1, Activity.ActivityType type1, String date1, String date2) throws ParseException {
        if(projectManager == null) {
            System.out.println("project has no lead");
            return;
        }
        if(user1.equals(projectManager)) {
            activities.add(Activity.createActivity(name1, type1, date1, date2,false));
        } else {
            System.out.println("user is not project lead");
        }
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
            System.out.println(projects.get(i).name);
            if(projects.get(i).projectManager == null) {
                System.out.println("project has no lead");
            } else {
                System.out.println(projects.get(i).projectManager.getName());
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
        for(int l = 0;l < Activity.getActivitiis().size(); l++) {
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
                if(activities.get(h).getName()==name) {
                    return activities.get(h);
                }
            }
        return null;
    }


}
