package Project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Activity {


    public static Activity ferie;

    static {
        try {
            activitiis = new ArrayList<Activity>();
            ferie = new Activity("ferie", ActivityType.PERMANENT, helpclass.stringToDate("01-01-0001"), helpclass.stringToDate("01-01-9999"), true);
            sygdom = new Activity("sygdom", Activity.ActivityType.PERMANENT, helpclass.stringToDate("01-01-0001"), helpclass.stringToDate("01-01-9999"), true);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static Activity sygdom;

    public static ArrayList<Activity> getActivitiis() {
        return activitiis;
    }

    private static ArrayList<Activity> activitiis;


    private ActivityType type;
    private String name;
    private Date startDate;
    private Date endDate;
    private int estimatedTime = 0;
    private int workedTime;
    private ArrayList<Employee> assignedUsers;


    // Constructor 1
    public Activity(String name, ActivityType type) throws ParseException {
        this.name = name;
        this.type = type;
        this.estimatedTime = 0;
    }

    public Activity(String name, ActivityType type, Date startDate, Date endDate, boolean isglobal) throws ParseException {
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estimatedTime = 0;
        this.workedTime = 0;
        this.assignedUsers = new ArrayList<Employee>();

        if (isglobal == true) {
            activitiis.add(this);
        }
    }


    public enum ActivityType {
        KRAVSPECIFIKATION,
        PROJEKTLEDELSE,
        ANALYSE,
        DESIGN,
        PROGRAMMERING,
        TEST_MED_MERE,
        PERMANENT
    }


    //get and setters
    public void setName(String name2) {
        this.name = name2;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getActivityName() {
        return name;
    }

    public ActivityType getActivityType() {
        return type;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int time) {
        this.estimatedTime = time;
    }

    public void setActivityType(ActivityType type) {
        this.type = type;
    }

    public void setStartDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = df.parse(date);
        this.startDate = d1;
    }

    public void setEndDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date d2 = df.parse(date);
        this.endDate = d2;
    }

    //We need to make date objects to use in the constructor :)

    public static Activity createActivity(String name1, ActivityType type1, Date date1, Date date2, boolean isglobal) throws ParseException {

        boolean result = false;
        for (ActivityType a : ActivityType.values()) {
            if (a.equals(type1))
                result = true;

        }
        assert name1 != "exit" && result;

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Activity activity = new Activity(name1, type1, date1, date2, isglobal);
        assert true;
        return activity;
    }

    public static Activity createActivity2(String name1, ActivityType type1, boolean isglobal) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Activity activity = new Activity(name1, type1, null, null, isglobal);


        return activity;
    }


    public static void printActivity() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        for (int i = 0; i < activitiis.size(); i++) {
            System.out.println(activitiis.get(i).getStartDate());
            System.out.println(activitiis.get(i).getEndDate());
            System.out.println(activitiis.get(i).getActivityName());
        }
    }

    public String getName() {
        return name;
    }


    public static Activity findActivity(String name) {
        for (int i = 0; i < activitiis.size(); i++) {
            if (activitiis.get(i).getName().equals(name)) {
                return activitiis.get(i);
            }
        }
        for (int h = 0; h < Project.projects.size(); h++) {
            for (int g = 0; g < Project.projects.get(h).activities.size(); g++) {
                if (Project.projects.get(h).activities.get(g).getName().equals(name))
                    return Project.projects.get(h).activities.get(g);
            }
        }
        return null;
    }

    public void assignUserToActivity(Employee user) {
        assignedUsers.add(user);
    }

    public ArrayList getAssignedUsers() {
        return assignedUsers;
    }

    public static void assignUserToActivity(Project project, Employee employee, Activity activity) {
        activity.assignUserToActivity(employee);
    }

    //checks all activities a user is assigned to and returns true if the number is less than the max allowed activities
    public static boolean checkAvailability(Employee employee) {
        int count = 0;
        for (int h = 0; h < Project.projects.size(); h++) {
            for (int g = 0; g < Project.projects.get(h).activities.size(); g++) {
                for (int l = 0; l < Project.projects.get(h).activities.get(g).assignedUsers.size(); l++) {
                    if (Project.projects.get(h).activities.get(g).assignedUsers.get(l).equals(employee)) {
                        count++;
                    }
                }
            }
        }
        if (count < employee.getMaxActivities()) {
            return true;
        }
        return false;
    }


}
