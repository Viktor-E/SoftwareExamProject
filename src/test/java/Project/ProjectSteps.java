package Project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectSteps {

    @When("An employee creates a project with the name SystemProgram")
    public void anEmployeeCreatesAProjectWithTheNameSystemProgram() {
    }

    @Then("A project called SystemProgram is saved")
    public void aProjectCalledSystemProgramIsSaved() {
    }

    @Given("There is already a project called Testing")
    public void thereIsAlreadyAProjectCalledTesting() {
    }

    @When("An employee tries to create a project called Testing")
    public void anEmployeeTriesToCreateAProjectCalledTesting() {
    }

    @Then("A message {string} is printed")
    public void aMessageIsPrinted(String arg0) {
    }
}
