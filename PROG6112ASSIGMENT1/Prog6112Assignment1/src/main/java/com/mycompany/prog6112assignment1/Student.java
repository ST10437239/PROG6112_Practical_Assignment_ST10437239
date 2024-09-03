/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112assignment1;

/**
 *
 * @author KeaBLeshomo
 */
import java.util.ArrayList;


public class Student {
    
    // array to store student data in memory
    private static ArrayList<Student> students = new ArrayList<>();
    
    
    private String StudentID;
    private String Name;
    private int age;
    private String StudentEmail;
    private String StudentCourse;
    
    
    // constructor to initialize a student object
    public Student(String StudentID, String Name, int age,String StudentEmail, String StudentCourse )  {
        this.StudentID = StudentID;
        this.Name = Name;
        this.age = age;
        this.StudentEmail = StudentEmail;
        this.StudentCourse = StudentCourse;
        
    }
    // method to save a new student to ArrayList
    public static void SaveStudent(String StudentID, String Name,int age, String StudentEmail, String StudentCourse) {
    students.add(new Student(StudentID, Name, age, StudentEmail,StudentCourse ));
    
    
    }
    // Method to search for a student by ID
    public static Student SearchStudent(String StudentID)  {
    
    for (Student student : students) {
        if (student.getStudentID().equals(StudentID)) {
            return student;
            
            
            
        }
    }
    return null;
    }
    
   // Method to delete a Student by ID
    public static boolean DeleteStudent(String StudentID)  {
    
    Student student = SearchStudent(StudentID);
    if (student!= null) {
        students.remove(student);
        return true;
    }
    return false;
    }
    // Method to display a report of all students
    public static void studentReport()  {
        if (students.isEmpty())  {
            System.out.println("No Students available.");
            return;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Student ID\tName\tAge\tStudentEmail\tStudentcourse");
        for (Student student : students) {
            System.out.println(student.StudentID + "\t" + student.Name + "\t" + student.age + "\t" + student.StudentEmail+ "\t" + student.StudentCourse);
            System.out.println("----------------------------------------------------------");
        }
    }
    
    // Method to exit the application
    public static void exitStudentApplication() {
        System.out.println("Exiting application....");
        // terminating program
        System.exit(0);
        
    }
    // gets student ID
    public String getStudentID() {
    return StudentID;
    
    }
    
    // gets student name
    public String getName() {
        return Name;
    }
    
    // gets student age
    public int getAge() {
        return age;
    }
    public String getStudentEmail() {
        return StudentEmail;
    }
    public String getStudentCourse() {
        return StudentCourse;
    }
}
