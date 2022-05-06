package Project;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ProjectManagerWindow extends Window {

    ProjectManagerWindow(Program program) throws ParseException {
        super("Project Window \n 1 to view projects you manage \n 2 to add activity \n 3 to view project info \n 4 to manage projects \n exit to return",program);
        functions();
        program.currentWindow = new OverviewWindow(program);
    }


    public void functions() throws ParseException {
        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.next();

        switch (input){

            case "1":{
                viewProjects();

            }break;

            case "2":{
                addActivtyToProject();
            }break;

            case "3":{
                listActivitiesOnProject();

            }break;
            case "4":{
                manageProjects();

            }break;

            case "exit":{
                program.currentWindow = new OverviewWindow(program);
            }break;


        }
    }

    private void manageProjects() {
        if(viewProjects() == null) {
            System.out.println("You must be a project manager to add an activity \n");
            return;
        }
        Project project = null;
        Scanner keyboard = new Scanner(System.in);
        while (project == null) {
            System.out.println("Project you want to manage:");
            String name = keyboard.next();
            if(name.equals("exit")) {
                return;
            }
            project = Project.findProject(name);
            if(project.getProjectManager() != program.currentUser) {
                project = null;
            }
        }
        System.out.println("1. setEstimatedTime");
        int what = 0;
        //very ugly! probably better way to do it :)
        while(what != 1 && what != 2 && what != 3 && what != 4 && what != 5 && what != 6 && what != 7) {
            try {
                what = Integer.parseInt(keyboard.next());
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            }
        }

        switch (what) {
            case 1:
                setEstimatedTimeOnProject(project);
                break;
            case 2:
                assignUserToActivity(project);
                break;
            case 3:
                changeStartDate();
                break;
            case 4:
                changeEndDate();
                break;
            case 5:
                changeProjectName();
                break;
            case 6:
                changeProjectManager();
                break;
            case 7:
                changeActivityName();
                break;
        }
    }

    //TODO : FINISH THIS!
    private void changeActivityName() {

    }

    private void changeProjectManager() {

    }

    private void changeProjectName() {

    }

    private void changeEndDate() {

    }

    private void changeStartDate() {
    }

    private void assignUserToActivity(Project project) {

    }

    private void setEstimatedTimeOnProject(Project project) {
        project.listActivities();

        Activity activity = null;

        Scanner keyboard = new Scanner(System.in);
        while (activity == null) {
            System.out.println("Please select an activity");
            String name = keyboard.next();
            if(name.equals("exit")) {
                return;
            }
            activity = project.findActivity(name);
        }
        System.out.println("Please enter estimated time for activity:");
        boolean good = false;
        int time = 0;
        while(good == false) {
            try {
                time = Integer.parseInt(keyboard.next());
                good = true;
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            }
        }

        activity.setEstimatedTime(time);
    }

    private void listActivitiesOnProject() {
        Project project = null;
        if(viewProjects() == null) {
            System.out.println("You must be a project manager to add an activity \n");
            return;
        }
        Scanner keyboard = new Scanner(System.in);
        while (project == null) {
            System.out.println("Project you want to view activities for:");
            String name = keyboard.next();
            if(name.equals("exit")) {
                return;
            }
            project = Project.findProject(name);
            if(project.getProjectManager() != program.currentUser) {
                project = null;
            }
        }
        project.listActivities();
    }

    private void addActivtyToProject() throws ParseException {
        if(viewProjects() == null) {
            System.out.println("You must be a project manager to add an activity \n");
            return;
        }
        Project project = null;
        String activityName = null;
        int type;
        Date Date1 = null;
        Date Date2 = null;
        Activity.ActivityType acttype = null;
        Scanner keyboard = new Scanner(System.in);
        while (project == null) {
            System.out.println("Project you want to add an activity to:");
            String name = keyboard.next();
            if(name.equals("exit")) {
                return;
            }
            project = Project.findProject(name);
            if(project.getProjectManager() != program.currentUser) {
                project = null;
            }
        }
        System.out.println("Please enter the name of the activity: ");
        activityName = keyboard.next();
        System.out.println("Chose type of activity: ");
        int i = 1;
        for (Activity.ActivityType myVar : Activity.ActivityType.values()) {
            System.out.println(i + " "+ myVar);
            i++;
        }

            System.out.println("Please enter the type of activity: ");
        int type1 = 0;
        //very ugly! probably better way to do it :)
        while(type1 != 1 && type1 != 2 && type1 != 3 && type1 != 4 && type1 != 5 && type1 != 6) {
            try {
                type1 = Integer.parseInt(keyboard.next());
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            }
        }

            switch (type1) {
                case 1:
                    acttype = Activity.ActivityType.KRAVSPECIFIKATION;
                    break;
                case 2:
                    acttype = Activity.ActivityType.PROJEKTLEDELSE;
                    break;
                case 3:
                    acttype = Activity.ActivityType.ANALYSE;
                    break;
                case 4:
                    acttype = Activity.ActivityType.DESIGN;
                    break;
                case 5:
                    acttype = Activity.ActivityType.PROGRAMMERING;
                    break;
                case 6:
                    acttype = Activity.ActivityType.TEST_MED_MERE;
                    break;
        }
        System.out.println("Do you want to set start/end date now? \n 1. yes \n 2. no");
        int yesno = 0;
            while(yesno != 1 && yesno != 2) {
                try {
                    yesno = Integer.parseInt(keyboard.next());
                } catch (NumberFormatException e) {
                    System.out.println("invalid input");
                }
            }


        switch (yesno) {
            case 1:
                System.out.println("Please enter Start date");
                Date date1 = null;
                while (date1 == null) {
                    String date = keyboard.next();
                    date1 = helpclass.stringToDate(date);
                    if (date1 != null) {
                        Date1 = date1;
                    }
                }
                System.out.println("Please enter End date");
                Date date2 = null;
                while (date2 == null) {
                    String date = keyboard.next();
                    date2 = helpclass.stringToDate(date);
                    if (date2 != null) {
                        Date2 = date2;
                    }
                }
                project.addActivty(activityName, acttype,Date1,Date2);

                break;
            case 2:
                project.addActivty2(activityName, acttype);
                break;
        }




    }

    private String  viewProjects() {
        System.out.println("List of projects you manage: ");
        int count = 0;
        for(int i = 0; i < Project.projects.size(); i++) {
            if(Project.projects.get(i).getProjectManager() == program.currentUser) {
                count++;
                System.out.println(Project.projects.get(i).getName());

            }
        }
        if(count == 0) {
            System.out.println("You aren't project manager on any projects");
            return null;
        }return "Project";

    }

}
