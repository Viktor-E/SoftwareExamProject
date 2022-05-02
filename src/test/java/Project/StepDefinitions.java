package Project;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	@When("I do nothing")
	public void i_do_nothing() {
	    
	}

	@Then("everything is okay")
	public void everything_is_okay() {
	    assertTrue(true);
	}

	@When("Project")
	public void test() {
		assertNull(EmployeeController.findEmployee("Project")); }

}

