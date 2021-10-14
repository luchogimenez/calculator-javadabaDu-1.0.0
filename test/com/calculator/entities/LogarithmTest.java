package com.calculator.entities;

import com.calculator.exceptions.ExceptionByNegative;
import com.calculator.exceptions.ExceptionByZero;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogarithmTest {

    Logarithm instance = new Logarithm();

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
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testOperate() throws Exception {
        System.out.println("operate");
        Double num_1 = 100d;
        Double num_2 = 10d;
        Double expResult = 2.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
    }

    @Test(expected = ExceptionByZero.class)
    public void testOperateZero() throws Exception {
        System.out.println("operate");
        Double num_1 = 0d;
        Double num_2 = 0d;
        Object result = instance.operate(num_1, num_2);
        Object expResult = ExceptionByZero.class;
        assertEquals(expResult, result);
    }

    @Test(expected = ExceptionByNegative.class)
    public void testOperateNegative() throws Exception {
        System.out.println("operate");
        Double num_1 = -100.00;
        Double num_2 = -10.00;
        Object expResult = ExceptionByNegative.class;
        Object result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
    }

    @Test(expected = ExceptionByNegative.class)
    public void testOperatePositiveAndNegative() throws Exception {
        System.out.println("operate");
        Double num_1 = -100.00;
        Double num_2 = 10.00;
        Object result = instance.operate(num_1, num_2);
        Object expResult = ExceptionByNegative.class;
        assertEquals(expResult, result);
    }
}
