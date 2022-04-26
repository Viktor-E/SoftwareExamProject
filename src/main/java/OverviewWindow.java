import java.text.ParseException;
import java.util.Scanner;

public class OverviewWindow extends Window  {

    OverviewWindow(Program program) throws ParseException {
        super("Overview Window\n Welcome "+ program.currentUser.getName() + "\nselect new Window:\n 1: Calender \n 2: Project\n 3: Register Time\n 4: Log ud",program);
        changeWindow();
    }

}
