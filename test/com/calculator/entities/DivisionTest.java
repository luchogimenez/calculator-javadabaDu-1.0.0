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


public class DivisionTest {

    Division instance = new Division();

    public DivisionTest() {

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

    @Test
    public void testOperateDivPositive() throws Exception {
        System.out.println("Division dos double positivos");
        Double num_1 = 10d;
        Double num_2 = 5d;

        Double expResult = 2d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testOperateDivNegative() throws Exception {
        System.out.println("Division dos double negativos");
        Double num_1 = -10d;
        Double num_2 = -5d;
        Double expResult = 2d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testOperateDivNegativeAndPositive() throws Exception {
        System.out.println("Division un doble negativo y otro positivo");
        Double num_1 = -10d;
        Double num_2 = 5d;
        Double expResult = -2d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        
    }

    @Test(expected = ExceptionByZero.class)
    public void testOperateDivByZero() throws Exception {
        System.out.println("Division por 0");
        Double num_1 = 10d;
        Double num_2 = 0d;
        Object result = instance.operate(num_1, num_2);
        Object expResult = ExceptionByZero.class;
        assertEquals(expResult, result);

       
    }
}
