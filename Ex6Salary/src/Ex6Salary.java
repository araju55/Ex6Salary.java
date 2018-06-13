/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joseph
 */
public class Ex6Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee worker = new Employee("Luke", 6.50, 45);
        System.out.println(worker.getemployeeName());
        System.out.println("Your Gross Salary is £" + worker.calculateGrossSalary());
        System.out.println("Your Net Salary after tax" + worker.calculateNetSalary());
  }
    
}
    

