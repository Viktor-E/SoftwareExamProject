import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {


        //test stuff
        EmployeeController.addEmployee("lol");

        EmployeeController.addEmployee("joe");

        EmployeeController.addEmployee("mama");

        EmployeeController.printArray();

        //Date format "MM-dd-yyyy" - date is wrong idk lol

        Activity.createActivity("test", Activity.ActivityType.ANALYSE, "1-9-1996", "00-00-2000");

        Activity.createActivity("test2", Activity.ActivityType.ANALYSE, "1-10-1990", "00-00-3000");

        Activity.printActivity();
    }
}
