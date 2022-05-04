package Project;

import io.cucumber.java.en.When;

import java.text.ParseException;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Main {

    Program program;
    public void main(String[] args) throws ParseException {


        //used for making permanent activities
        try {
            Activity.ferie = new Activity("ferie", Activity.ActivityType.PERMANENT, helpclass.stringToDate("01-01-0001"), helpclass.stringToDate("01-01-9999"),true);
            Activity.sygdom = new Activity("sygdom", Activity.ActivityType.PERMANENT, helpclass.stringToDate("01-01-0001"), helpclass.stringToDate("01-01-9999"),true);
        } catch (ParseException e) {
            e.printStackTrace();
        }



         program = new Program();



    }
}
