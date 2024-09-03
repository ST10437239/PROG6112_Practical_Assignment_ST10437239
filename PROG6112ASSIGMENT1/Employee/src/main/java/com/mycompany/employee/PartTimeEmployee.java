/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author KeaBLeshomo
 */
public class PartTimeEmployee extends Employee {
    
    private double hourlyRate;
    private int hoursWorked;
    
    // constructor to initialize a part time employee
    public PartTimeEmployee(int Id, String Name, String Department, double hourlyRate, int hoursWorked)  {


super (Id, Name, Department);
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;

}
   public double getHourlyRate()  {
   
   return hourlyRate;
   
   }
   public void setHourlyRate(double hourlyRate) {
   
   this.hourlyRate = hourlyRate;
   
   
   }
   public int getHoursWorked() {
   return hoursWorked;
   
   }
   
   public void setHoursWorked (int hoursWorked) {
   
   this.hoursWorked = hoursWorked;
   }
   
   // Display details relating to the part-time employee
   public void displayDetails() {
   
       System.out.println("Part-time Employee:");
       System.out.println("**************************************");
       System.out.println("ID:" + getID());
       System.out.println("Name:" + getName());
       System.out.println("Department:" + getDepartment());
       System.out.println("Hourly rate:" + hourlyRate);
       System.out.println("Hours worked:" + hoursWorked);
       System.out.println("Total Earnings:$" + (hourlyRate * hoursWorked));
       
   }
}
