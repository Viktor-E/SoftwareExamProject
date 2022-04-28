import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class RegisterTimeWindow extends Window  {

    RegisterTimeWindow(Program program) throws ParseException {
        super("RegisterTimeWindow\n 1 to Register time \n 2 to Ask for help \n 3 to view time registrations \n exit to return", program);
        functions();
        program.currentWindow = new OverviewWindow(program);

    }
    Date currentDate = new Date();
    Date eventStartDate;
    long day30 = 30l * 24 * 60 * 60 * 1000;
    boolean olderThan30 = false;
    boolean workhour = false;

    public void functions() throws ParseException {
        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.next();

        switch (input){
            
            case "1":{
                registerTime(program.currentUser);


            }break;
                
            case "2":{
                registerAnothersTime();
            }break;

            case "3":{
                viewRegisteredTime();
            }break;

            case "exit":{
                program.currentWindow = new OverviewWindow(program);
            }break;
            
            
        }
    }
    
    public void  registerTime(Employee user) throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        String date = null;
        //you can't register dates older than 30 days
        while (olderThan30 == false) {
            System.out.println("Enter Date dd-mm-yyyy");
            date = keyboard.next();
            eventStartDate = helpclass.stringToDate(date);
            if (eventStartDate == null) {
                olderThan30 = false;
            } else {
                olderThan30 = currentDate.before(new Date((eventStartDate.getTime() + day30)));
            }
        }
        System.out.println("current assigned activities: ");
        Project.listAssignedActivities(user);
        String activity = null;
        while (Activity.findActivity(activity) == null) {
            System.out.println("Enter activity");
            activity = keyboard.next();
        }
        String hours = "0";
        workhour = false;
        while (!workhour){
            System.out.println("Enter work mins");
            hours = keyboard.next();
            workhour = true;
            try {
                Integer.parseInt(hours);
            } catch(NumberFormatException e) {
                workhour = false;
            }
        }
        String[] dates = date.split("-");
        user.registerTime(new Date(Integer.parseInt(dates[2]) - 1900, Integer.parseInt(dates[1]) - 1, Integer.parseInt(dates[0])), Activity.findActivity(activity), Integer.parseInt(hours));
        System.out.println(dates[0] + "" + dates[1] + dates[2]);
    }
    public void registerAnothersTime() throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter user to register time");
        String user = keyboard.next();
        registerTime(EmployeeController.findEmployee(user));
    }

    public void viewRegisteredTime() throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        Date date1 = null;
        boolean exit = false;
        while (exit == false) {
            System.out.println("Enter Date dd-mm-yyyy or type exit to return");
            String date = keyboard.next();
            if(date.equals("exit")) {
                return;
            }
            date1 = helpclass.stringToDate(date);
            if (date1 != null) {
                program.currentUser.timeRegistations(date1);
            }
        }

    }
}
