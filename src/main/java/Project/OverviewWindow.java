package Project;

import java.text.ParseException;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OverviewWindow extends Window {

    OverviewWindow(Program program) throws ParseException {
        super("Overview Window\n Welcome "+ program.currentUser.getName() + "\nselect new Window:\n 1: Register Time \n 2: Project\n 3: Manage Projects\n 4: Log ud",program);
        changeWindow();
    }

}
