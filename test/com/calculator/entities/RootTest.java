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
public class RootTest {
    Root instance;
    public RootTest() {
        instance = new Root();
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
     * Test of operate method, of class Root.
     * @throws java.lang.Exception
     */
    @Test
    public void testOperatePositiveRoot() throws Exception {
        System.out.println("operate");
        Double radicand = 4d;
        Double index = 2d;
        Double expResult = 2d;
        
        Double result = instance.operate(radicand, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOperateNegativeRoot() throws Exception {
        System.out.println("operate");
        Double radicand = -8d;
        Double index = 3d;
        Double expResult = -2d;
        
        Double result = instance.operate(radicand, index);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = ExceptionByZero.class)
    public void testOperateNotRealRoot() throws Exception {
        System.out.println("operate");
        Double radicand = -4d;
        Double index = 2d;
        
        Object expResult = ExceptionByZero.class;
        Object result = instance.operate(radicand, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expected = ExceptionByZero.class)
    public void testOperateIndexZero() throws Exception {
        System.out.println("operate");
        Double radicand = 4d;
        Double index = 0d;
        
        Object expResult = ExceptionByZero.class;
        Object result = instance.operate(radicand, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
