package Project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {



    private static Employee currentUser;
    private static String name;

    @When("employee enters a four letter name")
    public void employee_enters_a_four_letter_name() {
        name = "Test";
    }
    @Then("Name is valid")
    public void name_is_valid() {
        assertTrue(helpclass.validateNameLength(name));
    }
    @When("employee enters a none four letter name")
    public void employee_enters_a_none_four_letter_name() {
        name = "Test1";
    }
    @Then("Name is invalid")
    public void name_is_invalid() {
        assertFalse(helpclass.validateNameLength(name));
    }



    @Given("there is a user with the name Test")
    public void there_is_a_user_with_the_name_test() {
        EmployeeController.addEmployee("Test");
    }
    @When("test logs in")
    public void test_logs_in() {
        currentUser = EmployeeController.findEmployee("Test");
    }
    @Then("test is logged in")
    public void test_is_logged_in() {
        assertNotNull(currentUser);
    }

    @When("Project is created")
    public void create_project() {Project.createProject("test");}
    @Then("project exists")
    public void check_project() {assertNotNull(Project.findProject("test"));}


    @Given("activity")
    public void create_activity() throws ParseException {Activity.createActivity2("test",Activity.ActivityType.TEST_MED_MERE,true);}
    @When("user register time")
    public void register_time() {EmployeeController.findEmployee("Test").registerTime(new Date(2002,05,22), Activity.findActivity("test"),3);}
    @Then("time is registered")
    public void time_registered(){assertTrue(EmployeeController.findEmployee("Test").getTimesRegistrationContainer().get(0).getTimeRegistration().size()>0);}


    @Given("user is assigned to activity")
    public void user_assigned(){Activity.findActivity("test").assignUserToActivity(EmployeeController.findEmployee("test"));}
    @Then("the user is listed")
    public void users_listed(){assertTrue(Activity.findActivity("test").getAssignedUsers().size()>0);}


//    @Given("project exists")
//    public void create_project2() {Project.createProject("test");}


//    @Given("user is project leader")
//    public void make_user_project_leader(){Project.findProject("test").setProjectManager("Test");}
//    @Given("user is not project leader")
//    public void do_nothing(){}

    @When("creating activity")
    public void add_activity() throws ParseException {Project.findProject("test").addActivity2("test",Activity.ActivityType.TEST_MED_MERE);}

    @Then("activity is created")
    public void activity_created() {assertNotNull(Activity.findActivity("test")); }


    @When("assign workers")
    public void assign_workers(){Activity.findActivity("test").assignUserToActivity(EmployeeController.findEmployee("Test"));}

    @Then("workers are assigned")
    public void workers_assigned(){assertTrue(Activity.findActivity("test").getAssignedUsers().size()>0);}

}
