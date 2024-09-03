/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;


 //this code was taken from w3resource
 //https://www.w3resource.com/java-exercises/oop/java-oop-exercise-6.php
 
/**
 *
 this java application is for a simple employee management system.it manages employees in a company, track their details and generate reports
 * the application does the following:
 * 1. Maintain a list of employees
 * 2. supports different kinds of employees (e.g. Full-time, part-time)
 * 3. allow adding new employees, listing all employees and generating a report of employee details
 * 
 */

import java.util.Scanner;

public abstract class Employee {
    
    private int Id;
    private String Name;
    private String Department;
    
    
    public Employee (int Id,String Name, String Department )  {
        this.Id = Id;
        this.Name = Name;
        this.Department = Department;
    
    }
    
    
    public int getID() {
    return Id;
    
    
    }
    
    public void setID(int Id) {
    this.Id = Id;
    
    }
    
    public String getName()  {
    
    return Name;
    
    }
    
    public void setName(String Name) {
    
    this.Name = Name;
    
    }
    
    public String getDepartment() {
    
    return Department;
    }
    
    public void setDepartment (String Department)  {
    
        this.Department = Department;
    
    
    }
    
    public abstract void displayDetails(); 



    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager(10);
        
        while (true) {
        System.out.println("Employee Management System");
            System.out.println("****************************");
            System.out.println("1. Add Part-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. List all employee");
            System.out.println("4. Generate report");
            System.out.println("5. Exit");
            System.out.println("Choose an option");
            
            
            int option = scanner.nextInt();
            scanner.nextLine();
            
            // add full-time employee
            switch (option) {
                case 1:
                    System.out.println("Enter ID:");
                    int fullTimeId = scanner.nextInt();
                    
                    scanner.nextLine();
                    System.out.print("Enter Name:");
                    
                    String fullTimeName = scanner.nextLine();
                    System.out.print("Enter Department:");
                    
                    String fullTimeDepartment = scanner.nextLine();
                    System.out.print("Enter Salary:");
                    
                    double fullTimeSalary = scanner.nextDouble();
                    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(fullTimeId,fullTimeName, fullTimeDepartment, fullTimeSalary);
                    manager.addEmployee(fullTimeEmployee);
                    break;
                    
                    
                 // add partime employee   
                case 2: 
                    System.out.print("Enter ID:");
                    int partTimeId= scanner.nextInt();
                    
                    scanner.nextLine();
                    System.out.print("Enter Name:");
                    
                    String partTimeName = scanner.nextLine();
                    System.out.println("Enter department:");
                    
                    String partTimeDepartment = scanner.nextLine();
                    System.out.println("Enter Hourly rate:");
                    
                    double hourlyRate = scanner.nextDouble();
                    System.out.println("Enter Hours worked: ");
                    
                    int hoursWorked = scanner.nextInt();
                    PartTimeEmployee partTimeEmployee = new PartTimeEmployee(partTimeId, partTimeName, partTimeDepartment, hourlyRate, hoursWorked);
                    manager.addEmployee(partTimeEmployee);
                    break;
                    
                //list all employees    
                case 3: 
                    manager.listEmployees();
                    break;
                    
                    //generate and display report
                case 4:
                    manager.generateReport();
                    break;
                    
                    // Exit the application
                case 5:
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                    
                    
                default:
                    System.out.println("Invalid option. please try again");
                    
                    
                    
            }
                    
                    
                    
            }
        
        
    }
}
