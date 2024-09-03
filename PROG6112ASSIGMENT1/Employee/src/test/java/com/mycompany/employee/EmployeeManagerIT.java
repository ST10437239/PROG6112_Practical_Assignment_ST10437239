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
public class EmployeeManagerIT {
    
    public EmployeeManagerIT() {
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
     * Test of addEmployee method, of class EmployeeManager.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee employee = null;
        EmployeeManager instance = null;
        instance.addEmployee(employee);
        
    }

    /**
     * Test of listEmployees method, of class EmployeeManager.
     */
    @Test
    public void testListEmployees() {
        System.out.println("listEmployees");
        EmployeeManager instance = null;
        instance.listEmployees();
        
    }

    /**
     * Test of generateReport method, of class EmployeeManager.
     */
    @Test
    public void testGenerateReport() {
        System.out.println("generateReport");
        EmployeeManager instance = null;
        instance.generateReport();
        
    }
    
}
