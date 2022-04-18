import io.cucumber.java.en_old.Ac;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Activity {

	private static ArrayList<Activity> activitiis = new ArrayList<Activity>();


	private ActivityType type;
	private String name;
	private Date startDate;
	private Date endDate;
	private int estimatedTime = 0;
	private int workedTime;



	// Constructor 1
	public Activity(String name, ActivityType type) {
		this.name = name;
		this.type = type;
		this.estimatedTime = 0;
	}

	public Activity(String name, ActivityType type, Date startDate, Date endDate) {
		this.name = name;
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
		this.estimatedTime = 0;
		this.workedTime = 0;
	}


	public enum ActivityType {
	KRAVSPECIFIKATION,
	PROJEKTLEDELSE,
	ANALYSE,
	DESIGN,
	PROGRAMMERING,
	TEST_MED_MERE
	}


	//get and setters
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public String getActivityName() {return name;}
	public ActivityType getActivityType() {return type;}
	public int getEstimatedTime() {return estimatedTime;}

	public void setActivityName(String name) {this.name = name;}
	public void setEstimatedTime(int time) {this.estimatedTime = time;}
	public void setActivityType(ActivityType type) {this.type = type;}
	// TODO : FIX date
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

	public static Activity createActivity(String name1, ActivityType type1, String date1, String date2) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = df.parse(date1);
		Date d2 = df.parse(date2);
		Activity activity = new Activity(name1, type1,d1,d2);

		//for testing
		activitiis.add(activity);

		return activity;
	}

	public static void printActivity() {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		for(int i = 0; i < activitiis.size(); i++) {
			System.out.println(activitiis.get(i).getStartDate());
			System.out.println(activitiis.get(i).getEndDate());
			System.out.println(activitiis.get(i).getActivityName());
		}
	}
	public String getName() {
		return name;
	}

	public static Activity findActivity(String name) {
		for(int i = 0; i < activitiis.size(); i++) {
			if(activitiis.get(i).getName().equals(name)) {
				return activitiis.get(i);
			}
		}
		return null;
	}

}
