package Project;

import java.text.ParseException;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarWindow extends Window {

    CalendarWindow(Program program) throws ParseException {
        super("CalenderWindow\n exit to return",program);
        for (int i = 0;program.currentUser.getTimesRegistrationContainer().size()>i;i++) {
            System.out.println(program.currentUser.getTimesRegistrationContainer().get(i).getDate());
        }
        changeWindow();
    }

}
