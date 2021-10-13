/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

import com.calculator.exceptions.ExceptionByZero;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucho
 */
public class PowerTest {
    Power instance;
    public PowerTest() {
        instance = new Power();
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
     * Test of operate method, of class Power.
     */
    @Test
    public void testOperate() throws Exception {
        System.out.println("operate");
        Double base = 4d;
        Double exponent = 2d;
        Double expResult = 16d;
        Double result = instance.operate(base, exponent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOperateBaseZero() throws Exception {
        System.out.println("operate");
        Double base = 0d;
        Double exponent = 2d;
        Double expResult = 0d;
        Double result = instance.operate(base, exponent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOperateExponentZero() throws Exception {
        System.out.println("operate");
        Double base = 8d;
        Double exponent = 0d;
        Double expResult = 1d;
        Double result = instance.operate(base, exponent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = ExceptionByZero.class)
    public void testOperateIndeterminatedZeroToZero() throws Exception {
        System.out.println("operate");
        Double base = 0d;
        Double exponent = 0d;
        
        Object expResult = ExceptionByZero.class;
        Object result = instance.operate(base, exponent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
