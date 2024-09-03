/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author KeaBLeshomo
 */
public class EmployeeManager{
  //Array to store employee objects  
private Employee[] employees;
// number of employees
private int employeeCount;

// constructor to initialize the employee
public  EmployeeManager(int size ) {

employees = new Employee[size];
employeeCount = 0;
}
    // method that stores employee to the array
   public void addEmployee(Employee employee) {
   
   if (employeeCount < employees.length)  {
       employees[employeeCount++] = employee;
       System.out.println("Employee added successfully");
   }else{
       
       System.out.println("No more spaces to add new employees.");
   }
   
   }
   // method that lists employees by displaying their details
   public void listEmployees() {
   
   for (int row = 0; row < employeeCount; row++)  {
       employees[row].displayDetails();
       System.out.println();
       
   }
   }
   
   // method to generate a report for all employees
   public void generateReport() {
       System.out.println("Employee report");
       System.out.println("**********************************");
       for (int row = 0; row < employeeCount; row++) {
           employees[row].displayDetails();
           System.out.println();
       }
   
   }
}
