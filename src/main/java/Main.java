import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException {
        EmployeeController.addEmployee("joe2");

        EmployeeController.addEmployee("mama");

        Project.createProject("testProject");

        Employee user = EmployeeController.findEmployee("joe2");

        Project idk = Project.findProject("testProject");

        //idk.setProjectManager(user);

        idk.addActivty(user,"test", Activity.ActivityType.ANALYSE, "01-09-1996", "01-01-2000" );

        Project.printProjects();

        Program program = new Program();


/*
        TestMain.start();

        EmployeeController.printArray();

        EmployeeController.addEmployee("joe2");

        //test stuff
        EmployeeController.addEmployee("lol");

        EmployeeController.addEmployee("joe2");

        EmployeeController.addEmployee("mama");

        EmployeeController.printArray();

        EmployeeController.findEmployee("lol");

        EmployeeController.findEmployee("joe2").setName("joe3");

        System.out.println("---");

        EmployeeController.printArray();


        Activity.createActivity("test", Activity.ActivityType.ANALYSE, "01-09-1996", "01-01-2000");

        Activity.createActivity("test2", Activity.ActivityType.ANALYSE, "01-10-2000", "01-02-3000");

        Activity.printActivity();

        Project.createProject("testProejct");


        Employee user = EmployeeController.findEmployee("joe2");

        user.registerTime(helpclass.stringToDate("01-10-2000"),Activity.findActivity("test"),100);

        user.registerTime(helpclass.stringToDate("01-10-2000"),Activity.findActivity("test2"),3000);

        user.timeRegistations(helpclass.stringToDate("01-10-2000"));

        EmployeeController.findEmployee("mama").registerTime(helpclass.stringToDate("01-10-2000"),Activity.findActivity("test"),400);

        EmployeeController.findEmployee("mama").registerTime(helpclass.stringToDate("01-10-2000"),Activity.findActivity("test"),500);

        EmployeeController.findEmployee("mama").timeRegistations(helpclass.stringToDate("01-10-2000"));

        user = EmployeeController.findEmployee("mama");

        user.registerTime(helpclass.stringToDate("01-10-2100"),Activity.findActivity("test"),300);

        user.registerTime(helpclass.stringToDate("01-10-2100"),Activity.findActivity("test2"),4000);

        user.timeRegistations(helpclass.stringToDate("01-10-2100"));

        user = EmployeeController.findEmployee("joe2");

        user.registerTime(helpclass.stringToDate("01-10-2100"),Activity.findActivity("test"),300);

        user.registerTime(helpclass.stringToDate("01-10-2100"),Activity.findActivity("test2"),4000);

        user.timeRegistations(helpclass.stringToDate("01-10-2100"));

        user = EmployeeController.findEmployee("joe2");

        user.timeRegistations(helpclass.stringToDate("01-10-2100"));


         */
    }
}
