package models;

/**
 *
 * @author cahuc
 */
public class Bank {

    private String name;
    private Employee[] employeeList; // Aggregation
    private Employee manager;

    public Bank(String name, Employee[] employeeList) {
        this.name = name;
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee newEmployee, int index) {
        employeeList[index] = newEmployee;
    }

    public void showEmployees() {

        for (int i = 0; i < employeeList.length; i++) {

            if (employeeList[i] != null) {
                System.out.println("Employee " + i + " info: " + employeeList[i].getEmployeeID());
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Employee[] employeeList) {
        this.employeeList = employeeList;
    }

}
