/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MultiplicateTest {
    private Multiplicate instance = new Multiplicate();
    
    public MultiplicateTest() {
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
     * Test of operate method, of class Multiplicate.
     */
    
    @org.junit.Test
    public void testOperatePositive() {
        System.out.println("Se ejecutó Test Multiplicacion de Positivos");
        Double num_1 = 3.0;
        Double num_2 = 7.0;
        Double expResult = 21.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @org.junit.Test
    public void testOperateNegative() {
        System.out.println("Se ejecutó Test Multiplicacion de Negativos");
        Double num_1 = -3.0;
        Double num_2 = -7.0;
          Double expResult = 21.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);

    
    }
}
