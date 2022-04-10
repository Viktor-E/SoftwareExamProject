import java.util.ArrayList;

public class EmployeeController {

    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    private static int employeeID = 0;

    //TODO check name length
    //TODO remove employee
    //TODO find employee (return index)

    public static void addEmployee(String name) {

        Employee employii = new Employee(name, employeeID);
        employeeID++;
        employees.add(employii);
    }

    public static void printArray() {

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName());
            System.out.println(employees.get(i).getEmployeeid());
        }
    }



}
