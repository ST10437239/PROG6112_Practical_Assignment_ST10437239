/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112assignment1;

// this code was taken from Stack overflow
// https://stackoverflow.com/questions/70640526/create-a-class-student-with-following-attributes
// this code was taken from geeksforgeeks
//https://www.geeksforgeeks.org/java-program-to-create-an-object-for-class-and-assign-value-in-the-object-using-constructor/
import java.util.Scanner;

public class Prog6112Assignment1 {
    
    
    

    public static void main(String[] args) {
     
        
        //Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // to control the main loop
        boolean running = true;
        
        
        while (running) {
            // Menu options for user input
            System.out.println("Student Management Application");
            System.out.println("********************************************");
            System.out.println("Menu:");
            System.out.println("1. Capture a new Student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a Student");
            System.out.println("4. View student report");
            System.out.println("5. Exit");
            
            
            System.out.print("Enter your choice");
            // read user choice
            int Choice = scanner.nextInt();
            // consume newline
            scanner.nextLine();
           
            
            // Menu Options
            switch (Choice) {
                case 1:
                    CaptureStudent(scanner);
                    break;
                    
                    case 2:
                        SearchStudent(scanner);
                        break;
                        
                    case 3:
                        DeleteStudent(scanner);
                        break;
                        
                    case 4:
                        Student.studentReport();
                        break;
                        
                    case 5:
                        Student.exitStudentApplication();
                        running = false;
                        break;
                        
                    default:
                        System.out.println("Invalid choice, please try again.");
                    
            }
            
        }
        
     scanner.close();
    }
    // method to capture a new student
   private static void CaptureStudent(Scanner scanner) {
       
       System.out.print("Enter Student ID:");
       String StudentID = scanner.nextLine();
       
       System.out.print("Enter Name:");
       String Name = scanner.nextLine();
       
       
       int age;
       while (true) {
           System.out.print("Enter Age");
           try {
               age= Integer.parseInt(scanner.nextLine());
               if (age>= 16) break;
               else System.out.println("you have entered a incorrect student age!!!  please re-enter the student age>>");
           } catch (NumberFormatException e) {
               System.out.println("Invalid input. Please enter a number.");
               
           }
       }
       
       // Student email
       System.out.println(" Enter student email :");
       String StudentEmail = scanner.nextLine();
       
       
       
       // Student course
       System.out.println(" Enter student course :");
        String StudentCourse = scanner.nextLine();
        System.out.println( "n/" );
       
       
       
   // capture student details
   Student.SaveStudent(StudentID, Name, age, StudentEmail,StudentCourse );
       System.out.println("Student details have been successfully captured");
       
   
   }
   
   // Method to search Student by ID
   private static void SearchStudent(Scanner scanner) {
   
       System.out.print("Enter Student ID to Search :");
       System.out.println("--------------------------------------");
       String StudentID = scanner.nextLine();
       
       Student student = Student.SearchStudent(StudentID);
       if (student != null)  {
           // Display student details
           System.out.println("Student ID: " + student.getStudentID());
           System.out.println("Name: " + student.getName());
           System.out.println("Age: " + student.getAge());
           System.out.println("Student Email:" + student.getStudentEmail());
           System.out.println("Student course:" + student.getStudentCourse());
       } else{
           System.out.println("Student cannot be found!1");
           
       }
   
   }
   
   // Method to delete a Student by ID
   private static void DeleteStudent(Scanner scanner) {
       
       System.out.print("Enter Student ID to delete:");
       String StudentID = scanner.nextLine();
       
       
       
   // confirmation to deleting user
       System.out.println("-----------------------------------------------");
       System.out.print("Are you sure you want to delete this student? (yes/no)");
       System.out.println("-----------------------------------------------");
       String Confirmation = scanner.nextLine();
       if (Confirmation.equalsIgnoreCase("yes")) {
           if (Student.DeleteStudent(StudentID)) {
               System.out.println("Student has been deleted.");
           }
             else{
            System.out.println("student cannot be located.");
          
    
       }
           
       } else{
           
           // Re-add student if deletion is canceled
            System.out.println("Deletion canceled. "); 
           //Student.SaveStudent(StudentID, "Unknown",0);
         
       }
       
      
   }

}
