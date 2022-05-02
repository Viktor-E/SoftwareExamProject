package Project;

import java.text.ParseException;

public class Main {


    public static void main(String[] args) throws ParseException {


        //used for making permanent activities
        try {
            Activity.ferie = new Activity("ferie", Activity.ActivityType.PERMANENT, helpclass.stringToDate("01-01-0001"), helpclass.stringToDate("01-01-9999"),true);
            Activity.sygdom = new Activity("sygdom", Activity.ActivityType.PERMANENT, helpclass.stringToDate("01-01-0001"), helpclass.stringToDate("01-01-9999"),true);
        } catch (ParseException e) {
            e.printStackTrace();
        }



        Program program = new Program();



    }
}
