package Project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeSteps {

    public static int i;
    public static Employee employee = null;
    public static int h;
    public static Date date;

    public static Date currentDate = new Date();
    public static Date eventStartDate;
    public static long day30 = 30l * 24 * 60 * 60 * 1000;
    public static boolean olderThan30 = false;

    @Given("activity")
    public void create_activity() throws ParseException {Activity.createActivity2("test",Activity.ActivityType.TEST_MED_MERE,true);}
    @When("user register time")
    public void register_time() {EmployeeController.findEmployee("Test").registerTime(new Date(2002,05,22), Activity.findActivity("test"),3);}
    @Then("time is registered")
    public void time_registered(){assertTrue(EmployeeController.findEmployee("Test").getTimesRegistrationContainer().get(0).getTimeRegistration().size()>0);}


    @When("user enters negative time register time")
    public void user_enters_negative_time_register_time() {
        EmployeeController.addEmployee("tes1");
        employee = EmployeeController.findEmployee("tes1");
        i = -2;
    }
    @Then("time is not registered")
    public void time_is_not_registered() {
        System.out.println(i);
        assertFalse(helpclass.checkWorkHours(i,employee));
    }

    @When("user enters a number bigger than expected work hours")
    public void user_enters_a_number_bigger_than_expected_work_hours() {
        i = 99999;
    }

    @When("user enters a date older than {int} days")
    public void user_enters_a_date_older_than_days(Integer int1) throws ParseException {
        date = helpclass.stringToDate("01-01-2011");
    }

    @Then("Time is not registered since date is too old")
    public void time_is_not_registered_since_date_is_too_old() {
        olderThan30 = currentDate.before(new Date((date.getTime() + day30)));
        assertFalse(olderThan30);
    }

    @When("user enters a date not older than {int} days")
    public void user_enters_a_date_not_older_than_days(Integer int1) throws ParseException {
        date = currentDate;
    }
    @Then("Time is registered2")
    public void time_is_registered2() {
        olderThan30 = currentDate.before(new Date((date.getTime() + day30)));
        assertTrue(olderThan30);
    }

}
