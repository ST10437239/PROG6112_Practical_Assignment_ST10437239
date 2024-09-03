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
public class PartTimeEmployeeIT {
    
    public PartTimeEmployeeIT() {
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
     * Test of getHourlyRate method, of class PartTimeEmployee.
     */
    @Test
    public void testGetHourlyRate() {
        System.out.println("getHourlyRate");
        PartTimeEmployee instance = null;
        double expResult = 0.0;
        double result = instance.getHourlyRate();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHourlyRate method, of class PartTimeEmployee.
     */
    @Test
    public void testSetHourlyRate() {
        System.out.println("setHourlyRate");
        double hourlyRate = 0.0;
        PartTimeEmployee instance = null;
        instance.setHourlyRate(hourlyRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoursWorked method, of class PartTimeEmployee.
     */
    @Test
    public void testGetHoursWorked() {
        System.out.println("getHoursWorked");
        PartTimeEmployee instance = null;
        int expResult = 0;
        int result = instance.getHoursWorked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoursWorked method, of class PartTimeEmployee.
     */
    @Test
    public void testSetHoursWorked() {
        System.out.println("setHoursWorked");
        int hoursWorked = 0;
        PartTimeEmployee instance = null;
        instance.setHoursWorked(hoursWorked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayDetails method, of class PartTimeEmployee.
     */
    @Test
    public void testDisplayDetails() {
        System.out.println("displayDetails");
        PartTimeEmployee instance = null;
        instance.displayDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
