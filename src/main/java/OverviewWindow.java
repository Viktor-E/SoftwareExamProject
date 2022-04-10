import java.util.Scanner;

public class OverviewWindow extends Window  {

    OverviewWindow(Program program){
        super("Overview Window\n select new Window:\n 1: Calender \n 2: Project\n 3: Register Time\n 4: Log ud",program);
        changeWindow();
    }

}
