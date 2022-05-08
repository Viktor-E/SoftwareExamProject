package Project;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhiteBoxTests {

    private static String name;

    @Test
    public void TestNameIs4Letters() {
        name = "Test";
        assertTrue(helpclass.validateNameLength(name));
    }
    @Test
    public void TestNameIs5Letters(){
        name = "Tests";
        assertFalse(helpclass.validateNameLength(name));
    }
    @Test
    public void TestNameHasNumber(){
        name = "Tes1";
        assertTrue(helpclass.validateNameLength(name));
    }
    @Test
    public void TestIs3Letters(){
        name = "Tes";
        assertFalse(helpclass.validateNameLength(name));
    }
   @Test
    public void ProjectNameIsRandom(){
       Project.createProject("Random1");
       assertNotNull(Project.findProject("Random1"));
   }
    @Test
    public void ProjectNameIsExit(){
        Project.createProject("exit");
        assertNull(Project.findProject("exit"));
    }
    @Test
    public void ActivityIsAdded() throws ParseException {
        Project.findProject("test").addActivity2("test",Activity.ActivityType.TEST_MED_MERE);
        assertNotNull(Activity.findActivity("test"));
    }
    @Test
    public void UserLogin(){
        EmployeeController.addEmployee("Test");
        assertNotNull(EmployeeController.findEmployee("Test"));
    }
    @Test
    public void UserLoginFalseName(){
        EmployeeController.addEmployee("Tests");
        assertNull(EmployeeController.findEmployee("Tests"));
    }
}