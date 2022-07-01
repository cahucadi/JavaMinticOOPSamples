package mintic;

import models.Bank;
import models.Car;
import models.Employee;

/**
 *
 * @author cahuc
 */
public class MainClass {

    public static void main(String[] args) {

        Employee e1 = new Employee("007");
        Employee e2 = new Employee("007");
        Employee e3 = new Employee("007");
        
        Employee[] list = new Employee[5];
        list[0] = e1;
        list[1] = e2;
        list[2] = e3;
        
        Bank b = new Bank("Mi Banco", list);
        b = null;
        
        
    }
}
