
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
    }
    
    @Test
    public void testOperateNegative() {
        System.out.println("operate");
        Double num_1 = -100.00;
        Double num_2 = -10.00;
        Logarithm instance = new Logarithm();
        Double expResult = 2.00;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
    }
}
