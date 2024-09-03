/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author KeaBLeshomo
 */
public class FullTimeEmployee extends Employee{
    
    private double Salary;
    
    public FullTimeEmployee(int Id,String Name, String Department, double Salary) {
    
    super(Id, Name, Department);
    this.Salary = Salary;
    
    }
    
    public double getSalary() {
    
    return Salary;
    
    }
    
    public void setSalary(double Salary) {
    
        this.Salary = Salary;
    
    }
    
    public void displayDetails () {
    
        System.out.println("Full-Time Employee:");
        System.out.println("ID:" + getID ());
         System.out.println("Name" + getName ());
          System.out.println("Department:" + getDepartment ());
           System.out.println("Salary: $" + Salary);
        
    
    }
}
