import java.util.ArrayList;
import java.util.Scanner;
public class LoginWindow extends Window {

    Scanner keyboard = new Scanner(System.in);

    public LoginWindow(Program program){

    super("Type your username to login:",program);
    String input="";
    Boolean correctInput = false;
    while(!correctInput){
    input = keyboard.next();

    for(int i = 0; i < program.employeeList.size(); i++){

            if(EmployeeController.findEmployee(input)!=null){
            correctInput = true;
            program.currentUser = program.employeeList.get(i);
            break;
            }

        }

    if(correctInput==false){
        System.out.println("Unknown ID want to register it? y/n");
        String input2 = keyboard.next();
        if (input2.equals("y")) {
            EmployeeController.addEmployee(input);
            login(EmployeeController.findEmployee(input));
        }
        printMessage();


    }else{
        login(EmployeeController.findEmployee(input));

    }

    }

    }
    public void login(Employee newUser){
        program.currentUser = newUser;
        program.changeWindow(new OverviewWindow(program));

    }

}
