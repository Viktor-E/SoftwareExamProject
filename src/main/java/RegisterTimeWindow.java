import java.util.Date;
import java.util.Scanner;

public class RegisterTimeWindow extends Window  {

    RegisterTimeWindow(Program program){
        super("RegisterTimeWindow\n 1 to Register time \n 2 to Ask for help\n exit to return", program);
        functions();
        program.currentWindow = new OverviewWindow(program);

    }

    public void functions(){
        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.next();

        switch (input){
            
            case "1":{
                registerTime(program.currentUser);


            }break;
                
            case "2":{
                registerAnothersTime();
            }break;
                
            case "exit":{
                program.currentWindow = new OverviewWindow(program);
            }break;
            
            
        }
    }
    
    public void  registerTime(Employee user){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Date dd/mm/yyyy");
        String date = keyboard.next();
        System.out.println("Enter activity");
        String activity = keyboard.next();
        System.out.println("Enter work hours");
        String hours = keyboard.next();
        String[] dates = date.split("/");
        user.registerTime(new Date(Integer.parseInt(dates[2])-1900,Integer.parseInt(dates[1])-1,Integer.parseInt(dates[0])),Activity.findActivity(activity), Integer.parseInt(hours));
        System.out.println(dates[0]+""+dates[1]+dates[2]);
    }
    public void registerAnothersTime(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter user to register time");
        String user = keyboard.next();
        registerTime(EmployeeController.findEmployee(user));
    }
    
    /*
    ArrayList of RegistrationContainer
    RegistrationContainer:
        - Date e.g. 2022-02-13
        - ArrayList of TimeRegistration
    TimeRegistration
        Time spent
        Activity


     */

}
