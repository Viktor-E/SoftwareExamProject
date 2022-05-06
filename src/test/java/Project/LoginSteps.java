package Project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
}
