
package com.calculator.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogarithmTest {
    
    public LogarithmTest() {
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
     * Test of operate method, of class Logarithm.
     */
    @Test
    public void testOperate() {
        System.out.println("operate");
        Double num_1 = 100d;
        Double num_2 = 10d;
        Logarithm instance = new Logarithm();
        Double expResult = 2.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOperateNegative() {
        System.out.println("operate");
        Double num_1 = -100d;
        Double num_2 = -10d;
        Logarithm instance = new Logarithm();
        Double expResult = -2.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testOperateZero() {
        System.out.println("operate");
        Double num_1 = 100d;
        Double num_2 = 0d;
        Logarithm instance = new Logarithm();
        Double expResult = 0.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
