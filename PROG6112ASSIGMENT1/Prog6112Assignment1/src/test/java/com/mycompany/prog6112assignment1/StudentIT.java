/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.prog6112assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KeaBLeshomo
 */
public class StudentIT {
    
    public StudentIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SaveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("SaveStudent");
        String StudentID = "12345";
        String Name = "John Doe";
        int age = 20;
        String StudentEmail = "johndoe@example.com";
        String StudentCourse = "Computer Science";
        Student.SaveStudent(StudentID, Name, age, StudentEmail, StudentCourse);
        
    }

    /**
     * Test of SearchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("SearchStudent");
        String StudentID = "12345";
        Student expResult = null;
        Student result = Student.SearchStudent(StudentID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        String StudentID = "12345";
        boolean expResult = false;
        boolean result = Student.DeleteStudent(StudentID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of studentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
        System.out.println("studentReport");
        Student.studentReport();
           }

    /**
     * Test of exitStudentApplication method, of class Student.
     */
    @Test
    public void testExitStudentApplication() {
        System.out.println("exitStudentApplication");
        Student.exitStudentApplication();
       
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 20;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStudentEmail method, of class Student.
     */
    @Test
    public void testGetStudentEmail() {
        System.out.println("getStudentEmail");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStudentCourse method, of class Student.
     */
    @Test
    public void testGetStudentCourse() {
        System.out.println("getStudentCourse");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentCourse();
        assertEquals(expResult, result);
        
    }
    
}
