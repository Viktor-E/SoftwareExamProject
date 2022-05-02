package Project;

public class TimeRegistration {

    private Activity workedActivity;
    private int workedTime;


    // Constructor
    public TimeRegistration(Activity activity, int workedTime) {
        this.workedActivity = activity;
        this.workedTime = workedTime;
    }

    //get functions
    public int getWorkedTime() {return workedTime;}
    public Activity getWorkedActivity() {return workedActivity;}


}
