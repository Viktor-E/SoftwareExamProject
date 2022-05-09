package Project;

import java.text.ParseException;
import java.util.ArrayList;

public class Program {

    ArrayList<Employee> employeeList;
    Window currentWindow;
    Employee currentUser;


    Program() throws ParseException {
        this.employeeList = EmployeeController.getEmployees();
        currentWindow = new LoginWindow(this);
    }

    public void changeWindow(Window newWindow) {
        currentWindow = newWindow;
    }

    public void changeWindow(String number) throws ParseException {

        switch (number) {
            case "1": {
                currentWindow = new RegisterTimeWindow(this);
            }
            break;
            case "2": {
                currentWindow = new ProjectWindow(this);
            }
            break;
            case "3": {
                currentWindow = new ProjectManagerWindow(this);
            }
            break;
            case "4": {
                currentWindow = new LoginWindow(this);
                currentUser = null;
            }
            break;
            case "exit": {
                currentWindow = new OverviewWindow(this);
            }
            break;

        }

    }

}
