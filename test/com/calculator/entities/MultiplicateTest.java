package com.calculator.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @org.junit.Test
    public void testOperatePositive() {
        System.out.println("Se ejecutó Test Multiplicacion de Positivos");
        Double num_1 = 3.0;
        Double num_2 = 7.0;
        Double expResult = 21.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);

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

    @org.junit.Test
    public void testOperateNegativeAndPositive() {
        System.out.println("Se ejecutó Test Multiplicacion de Negativos y Positivos");
        Double num_1 = -3.0;
        Double num_2 = 7.0;
        Double expResult = -21.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);

    }

    @org.junit.Test
    public void testOperateByZero() {
        System.out.println("Se ejecutó Test Multiplicacion de Cero");
        Double num_1 = 3.0;
        Double num_2 = 0.0;
        Double expResult = 0.0;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);

    }
}
