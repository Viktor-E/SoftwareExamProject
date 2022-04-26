import java.text.ParseException;

public class ProjectWindow extends Window  {

    ProjectWindow(Program program) throws ParseException {
        super("Project Window\n exit to return",program);
        Project.printProjects();
        changeWindow();
    }


}
