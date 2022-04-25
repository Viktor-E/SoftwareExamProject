public class ProjectWindow extends Window  {

    ProjectWindow(Program program){
        super("Project Window\n exit to return",program);
        Project.printProjects();
        changeWindow();
    }


}
