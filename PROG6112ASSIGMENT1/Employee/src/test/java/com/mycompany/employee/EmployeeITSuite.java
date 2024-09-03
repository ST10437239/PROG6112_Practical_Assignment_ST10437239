/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.mycompany.employee;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author KeaBLeshomo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.employee.PartTimeEmployeeIT.class, com.mycompany.employee.EmployeeIT.class, com.mycompany.employee.FullTimeEmployeeIT.class, com.mycompany.employee.EmployeeManagerIT.class})
public class EmployeeITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
