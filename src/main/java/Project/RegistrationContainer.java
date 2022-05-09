package Project;

import java.util.ArrayList;
import java.util.Date;

// Viktor
public class RegistrationContainer {

    public ArrayList<TimeRegistration> timeRegistration;
    private Date workedDate;

    // Constructor
    public RegistrationContainer(Date date) {
        this.workedDate = date;
        this.timeRegistration = new ArrayList<TimeRegistration>();
    }

    public void addRegistration(TimeRegistration timeRegistration1) {
        timeRegistration.add(timeRegistration1);
    }

    public Date getDate() {
        return workedDate;
    }

    public ArrayList<TimeRegistration> getTimeRegistration() {
        return timeRegistration;
    }

}
