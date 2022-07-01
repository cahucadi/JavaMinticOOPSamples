/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cahuc
 */
public class Employee {
    
    private String employeeID;
    
    public Employee( String employeeID ){
        this.employeeID = employeeID; 
    }
    
    public void setEmployeeID( String employeeID ){
        this.employeeID = employeeID;
    }
    
    public String getEmployeeID(){
        return employeeID;
    }
    
}
