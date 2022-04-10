import java.util.Date;

public class Main {

    public static void main(String[] args) {

        EmployeeController.addEmployee("lol");

        EmployeeController.addEmployee("joe");

        EmployeeController.addEmployee("mama");

        EmployeeController.printArray();

        Program program = new Program(EmployeeController.employees);

    }
}
