package Project;

import java.util.ArrayList;

public class EmployeeController {

    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    private static int employeeID = 0;

    //make employee object
    public static void addEmployee(String name) {
        if (helpclass.validateNameLength(name) && findEmployee(name) == null) {
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

    //print all employees names
    public static void printEmployees() {
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName());
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
