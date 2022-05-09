package Project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class helpclass {
    private static DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    static String regex = "[0-9]{1,2}-[0-9]{1,2}-[0-9]{1,4}";

    //Date is an object and this function can be used to create one from a string
    //check format using regex match
    public static Date stringToDate(String date) throws ParseException {
        if (date.matches(regex)) {
            return df.parse(date);
        } else return null;
    }

    //check that a username is 4 characters long
    public static boolean validateNameLength(String name) {

        try {
            if (name.length() != 4) {
                System.out.println("Username has to be 4 characters");
                return false;
            }
            return true;

        } catch (NumberFormatException e) {
            System.out.println("Username has to be 4 characters");
            return false;
        }
    }

    //check if the amount of time is between 0 and expected work minutes
    public static boolean checkWorkHours(int i, Employee employee) {
        if (i > 0 && i < employee.getMaxMinutes()) {
            return false;
        }
        return true;
    }
}
