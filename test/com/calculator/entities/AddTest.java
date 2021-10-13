/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

<<<<<<< HEAD
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dylan losada
=======
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mirna
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
 */
public class AddTest {
    
    public AddTest() {
    }
    
<<<<<<< HEAD
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
=======
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
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
    public void tearDown() {
    }

    /**
     * Test of operate method, of class Add.
     */
<<<<<<< HEAD
    @Test
    public void testOperate() {
        System.out.println("operate");
        Double num_1 = null;
        Double num_2 = null;
        Add instance = new Add();
        Double expResult = null;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
=======
    @org.junit.Test
    public void testOperateIntegerNumbers() {
        System.out.println("Suma de numeros Enteros");
        Double num_1 = 10d;
        Double num_2 = 15d;
        Add instance = new Add();
        Double expResult = 25d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @org.junit.Test
    public void testOperateNegativeNumbers() {
        System.out.println("Suma de numeros Enteros Negativos");
        Double num_1 = -10d;
        Double num_2 = -15d;
        Add instance = new Add();
        Double expResult = -25d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @org.junit.Test
    public void testOperateIntegerNegativePositiveNumbers() {
        System.out.println("Suma de un numero Entero Positivo y otro Negativo");
        Double num_1 = -10d;
        Double num_2 = 15d;
        Add instance = new Add();
        Double expResult = 5d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.Test
    public void testOperateDecimalPositiveNumbers() {
        System.out.println("Suma de numeros Decimales Positivos");
        Double num_1 = 10.55555d;
        Double num_2 = 15.33333d;
        Add instance = new Add();
        Double expResult = 25.88888d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
    @org.junit.Test
    public void testOperateDecimalNegativeNumbers() {
        System.out.println("Suma de numeros Decimales Negativos");
        Double num_1 = -10.5d;
        Double num_2 = -15.3d;
        Add instance = new Add();
        Double expResult = -25.8d;
        Double result = instance.operate(num_1, num_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
}
