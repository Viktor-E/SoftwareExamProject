import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

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
    private ArrayList<Activity> activities = new ArrayList<Activity>();

    //TODO : make sure NULL doesn't crash
    public Project(String name) {
        this.name = name;
        this.startDate = null;
        this.endDate = null;
        this.projektnummre = currentYear+this.runner;
        this.projectManager = null;
        this.activities = null;
    }

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = null;
        this.endDate = null;
        this.projektnummre = currentYear+this.runner;
        this.projectManager = null;
        this.activities = null;
    }

    public static void createProject(String name) {
        Project Procject1 = new Project(name);
        projects.add(Procject1);
    }

    public void addActivty(String name1, Activity.ActivityType type1, String date1, String date2) throws ParseException {

        activities.add(Activity.createActivity(name1, type1, date1, date2));


    }


}
