import java.util.Scanner;

public class TestMain {

    public static void start() {

        Scanner sc = new Scanner(System.in);
        Scanner username = new Scanner(System.in);
        int number;
        do {
            System.out.println("please type \"1\" to login or type \"2\" to register new user");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (number != 1 && number != 2);
        if(number == 1) {

            System.out.println("please type your username");

            String userName = username.nextLine();

           Employee user = EmployeeController.findEmployee(userName);

           if(user == null) {
               System.out.println("no user with that name found! please try again");
               start();
           }
        }
        if(number == 2) {
            System.out.println("please type a username");

            String userName = username.nextLine();

            EmployeeController.addEmployee(userName);

            start();
        }
    }
}

