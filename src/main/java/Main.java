import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {


        //test stuff
        EmployeeController.addEmployee("lol");

        EmployeeController.addEmployee("joe");

        EmployeeController.addEmployee("mama");

        EmployeeController.printArray();


        Activity.createActivity("test", Activity.ActivityType.ANALYSE, "01-09-1996", "01-01-2000");

        Activity.createActivity("test2", Activity.ActivityType.ANALYSE, "01-10-2000", "01-02-3000");

        Activity.printActivity();

        Project.createProject("testProejct");


        Employee user = EmployeeController.findEmployee("joe");
        user.registerTime(helpclass.stringToDate("01-10-2000"),Activity.findActivity("test"),100);

        user.registerTime(helpclass.stringToDate("01-10-2000"),Activity.findActivity("test2"),3000);

        user.timeRegistations(helpclass.stringToDate("01-10-2000"));
    }
}
