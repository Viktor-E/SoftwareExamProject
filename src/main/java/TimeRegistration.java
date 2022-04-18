public class TimeRegistration {

    private Activity workedActivity;
    private int workedTime;



    public TimeRegistration(Activity activity,int workedTime) {
        this.workedActivity = activity;
        this.workedTime = workedTime;
    }

    public int getWorkedTime() {return workedTime;}

    public Activity getWorkedActivity() {return workedActivity;}


}
