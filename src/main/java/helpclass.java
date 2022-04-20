import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class helpclass {
    private static DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    //Date is an object and this function can be used to create one from a string
    public static Date stringToDate(String date) throws ParseException {
        return  df.parse(date);
    }

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



}
