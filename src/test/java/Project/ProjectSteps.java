package Project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.Ha;
import org.junit.Assert;


import static org.junit.jupiter.api.Assertions.*;


public class ProjectSteps {

    private static int intsPreviousSize = 0;
    private static Project project1;
    private static Project project2;
    private static int i = 0;

    @When("An employee creates the first project")
    public void an_employee_creates_the_first_project() {
        Project.createProject("Project1");
        project1 = Project.findProject("Project1");
    }
    @Then("The project ID is {int}")
    public void the_project_id_is(Integer int1) {
        assertEquals(int1, project1.getProjektnummre());
    }

    @Then("The next project ID is {int}")
    public void the_next_project_id_is(Integer int2) {
        assertEquals(int2, project2.getProjektnummre());
    }

    @Then("An employee creates another project")
    public void an_employee_creates_another_project() {
        Project.createProject("Project2");
        project2 = Project.findProject("Project2");
    }

    @When("An employee creates a project with the name SystemProgram")
    public void anEmployeeCreatesAProjectWithTheNameSystemProgram() {
        Project.createProject("SystemProgram");
    }

    @Then("A project called SystemProgram is saved")
    public void aProjectCalledSystemProgramIsSaved() {
        assertNotNull(Project.findProject("SystemProgram"));
    }

    @Given("There is already a project called Testing")
    public void thereIsAlreadyAProjectCalledTesting() {
        Project.createProject("Testing");
    }

    @When("An employee tries to create a project called Testing")
    public void anEmployeeTriesToCreateAProjectCalledTesting() {
        intsPreviousSize = Project.projects.size();
        Project.createProject("Testing");
    }

    @Then("the project isn't created")
    public void the_project_isn_t_created() {
        assertEquals(intsPreviousSize, Project.projects.size());
    }


}
