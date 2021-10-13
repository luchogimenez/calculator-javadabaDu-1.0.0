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
 * @author Mirna
 */
public class SubTest {
    
    public SubTest() {
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
     * Test of operate method, of class Sub.
     */
    @Test
    public void testOperateIntegerPositiveNumbers() {
        System.out.println("Resta de Enteros Psitivos");
        Double num_1 = 25d;
        Double num_2 = 10d;
        Sub instance = new Sub();
        Double expResult = 15d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOperateIntegerNegativeNumbers()  {
        System.out.println("Resta de Enteros Negativos");
        Double num_1 = -25d;
        Double num_2 = -10d;
        Sub instance = new Sub();
        Double expResult = -15d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOperateIntegerNegativePositiveNumbers() {
        System.out.println("Resta de un numero Entero Positivo y otro Negativo");
        Double num_1 = -25d;
        Double num_2 = 10d;
        Sub instance = new Sub();
        Double expResult = -35d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOperateDecimalPositiveNumbers() {
 
        System.out.println("Resta de numeros Decimales Positivos");
        Double num_1 = 25.55555d;
        Double num_2 = 10.55555d;
        Sub instance = new Sub();
        Double expResult = 15d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testOperateDecimalNegativeNumbers() {
 
        System.out.println("Resta de numeros Decimales Negativos");
        Double num_1 = -25.55555d;
        Double num_2 = -10.55555d;
        Sub instance = new Sub();
        Double expResult = -15d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

