import java.util.ArrayList;
import java.util.Scanner;
public class LoginWindow extends Window {

    Scanner keyboard = new Scanner(System.in);

    public LoginWindow(Program program){

    super("Skriv dit brugernavn for at logge ind:",program);
    String input="";
    Boolean correctInput = false;
    while(!correctInput){
    input = keyboard.next();

    for(int i = 0; i < program.employeeList.size(); i++){

            if( program.employeeList.get(i).getName().equalsIgnoreCase(input )){
            correctInput = true;
            program.currentUser = program.employeeList.get(i);
            break;
            }
        }

    if(correctInput==false){
        System.out.println("Wrong ID try again");

    }else{
        program.changeWindow(new OverviewWindow(program));

    }

    }

    }

}
