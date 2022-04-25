import java.util.ArrayList;

public class EmployeeController {

    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    private static int employeeID = 0;

    //TODO check name length (has to be 4) (should be done but should test)
    //TODO remove employee
    //TODO find employee (based on name)
    //TODO in activity make sure to handle NULL

    //make employee object
    public static void addEmployee(String name) {
        if (helpclass.validateNameLength(name)) {
            Employee employee = new Employee(name, employeeID);
            employeeID++;
            employees.add(employee);
            Activity.ferie.assignUserToActivity(employee);
            Activity.sygdom.assignUserToActivity(employee);
        }
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    //used for testing
    public static void printArray() {
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName());
            System.out.println(employees.get(i).getEmployeeid());
        }
    }

    //takes employee name as input and returns the employee object
    public static Employee findEmployee(String name) {
        if(helpclass.validateNameLength(name)) {
            for(int i = 0; i < employees.size(); i++) {
                if(employees.get(i).getName().equals(name)) {
                    return employees.get(i);
                }
            }
        }
        return null;
    }



}
