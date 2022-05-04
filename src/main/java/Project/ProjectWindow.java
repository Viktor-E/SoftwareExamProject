package Project;

import java.text.ParseException;
import java.util.Scanner;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProjectWindow extends Window {

    ProjectWindow(Program program) throws ParseException {
        super("Project Window \n 1 to make a new project \n 2 to view projects \n 3 to add project leader \n exit to return",program);
        functions();
        program.currentWindow = new OverviewWindow(program);
    }


    public void functions() throws ParseException {
        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.next();

        switch (input){

            case "1":{
                makeproject();


            }break;

            case "2":{
                System.out.println("List of all projects: ");
                Project.printProjects();
            }break;

            case "3":{
                addProjectLead();

            }break;

            case "exit":{
                program.currentWindow = new OverviewWindow(program);
            }break;


        }
    }

    private void addProjectLead() {
        System.out.println("You can only add project managers to projects without manager otherwise the current project manager as to do it");
        Scanner keyboard = new Scanner(System.in);
        Employee user = null;
        while(user == null) {
            System.out.println("User you want to make project manager:");
            String name = keyboard.next();
            user = EmployeeController.findEmployee(name);
        }
        System.out.println("Current projcets without leads: ");
        Project.printProjectsWithoutLead();
        System.out.println("");
        boolean set = false;
        while (set == false) {
            String projectname = keyboard.next();
            Project project = Project.findProject(projectname);
            if (project == null) {
                System.out.println("Project not found");
            } else {
                if (project.getProjectManager() == null) {
                    project.setProjectManager(user);
                    set = true;
                }
            }

        }

    }

    private void makeproject() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Project name");
        String name = keyboard.next();

        Project.createProject(name);
    }

}
