package Project;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
