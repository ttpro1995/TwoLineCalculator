/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thien
 */
public class CalculationTest {
    
    public CalculationTest() {
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
     * Test of plus method, of class Calculation.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        String a = "1/2";
        String b = "1/3";
        double expResult = (double)5/6;
        double result = Calculation.plus(a, b);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of minus method, of class Calculation.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        String a = "";
        String b = "";
        double expResult = 0.0;
        double result = Calculation.minus(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class Calculation.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        String a = "";
        String b = "";
        double expResult = 0.0;
        double result = Calculation.mul(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Calculation.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        String a = "";
        String b = "";
        double expResult = 0.0;
        double result = Calculation.div(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
