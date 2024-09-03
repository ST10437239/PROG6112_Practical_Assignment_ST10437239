/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.employee;

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
public class FullTimeEmployeeIT {
    
    public FullTimeEmployeeIT() {
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
     * Test of getSalary method, of class FullTimeEmployee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        FullTimeEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class FullTimeEmployee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double Salary = 0.0;
        FullTimeEmployee instance = null;
        instance.setSalary(Salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDetails method, of class FullTimeEmployee.
     */
    @Test
    public void testDisplayDetails() {
        System.out.println("displayDetails");
        FullTimeEmployee instance = null;
        instance.displayDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
