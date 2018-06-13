/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class Employee {
    
    private String employeeName;
    private double hours;
    private double payRate;
    
    public Employee(String name, double employeeHours, double ratePay) {
        
        employeeName = name;
        hours = employeeHours;
        payRate = ratePay;
    }
    
public String getemployeeName() {
    return employeeName;
}

public double calculateGrossSalary() {
    return hours * payRate;
}

public double calculateNetSalary() {
    return 0.8 * calculateGrossSalary();
}

}
