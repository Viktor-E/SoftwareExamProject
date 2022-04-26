import java.text.ParseException;
import java.util.Scanner;

public class Window {

    String startMessage;
    Program program;

    Window(String message,Program program){
        startMessage = message;
        this.program = program;
        printMessage();

    }

    public void printMessage(){
    System.out.println(startMessage);

    }

    public void changeWindow() throws ParseException {

        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.next();

        program.changeWindow(input);

    }

}
