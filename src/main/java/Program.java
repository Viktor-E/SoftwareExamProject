import java.util.ArrayList;

public class Program {

    DataBase dataBase;
    ArrayList<Employee> employeeList;
    Window currentWindow;
    Employee currentUser;


    Program(ArrayList<Employee> employeeList){
    this.employeeList = employeeList;
    currentWindow = new LoginWindow(this);
    }

    public void changeWindow(Window newWindow) {
        currentWindow = newWindow;
    }
    public void changeWindow(String number){

        switch(number){
            case "1":{
                currentWindow = new CalendarWindow(this);
            }break;
            case "2":{
                currentWindow = new ProjectWindow(this);
            }break;
            case "3":{
                currentWindow = new RegisterTimeWindow(this);
            }break;
            case "4":{
                currentWindow = new LoginWindow(this);
                currentUser=null;
            }break;
            case "exit":{
                currentWindow = new OverviewWindow(this);
            }break;

        }

    }

}
