/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * https://www.tutorialspoint.com/junit/junit_parameterized_test.html
 * @author Thien
 */ 
@RunWith(Parameterized.class)
public class CalculationTest {
    private String a;
    private String b;
    private double plusExpected;
    private double minusExpected;
    private double mulExpected;
    private double divExpected;
    public CalculationTest(String a, String b, String plusExpected, String minusExpected, String mulExpected, String divExpected) {
        this.a = a.trim();
        this.b = b.trim();
        plusExpected = plusExpected.trim();
        minusExpected = minusExpected.trim();
        mulExpected = mulExpected.trim();
        divExpected = divExpected.trim();
        this.plusExpected = Calculation.fractionToDouble(plusExpected);
        this.minusExpected = Calculation.fractionToDouble(minusExpected);
        this.mulExpected = Calculation.fractionToDouble(mulExpected);
        this.divExpected = Calculation.fractionToDouble(divExpected);
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

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws FileNotFoundException, IOException {
        // get test data from data_fibonacci.csv
        CSVReader reader = new CSVReader(new FileReader("test_data.csv"));
        List myEntries = reader.readAll();
        return myEntries;
    }
    
//    @Test 
//    public void testDatadriven(){
//        System.out.println("MEOW");
//        System.out.println(this.a);
//        System.out.println(this.b);
//        System.out.println(this.plusExpected);
//    }
    
    /**
     * Test of plus method, of class Calculation.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");  
        double result = Calculation.plus(this.a, this.b);
        assertEquals(result, this.plusExpected, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of minus method, of class Calculation.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");  
        double result = Calculation.minus(this.a, this.b);
        assertEquals(result, this.minusExpected, 0.00001);
    }

    /**
     * Test of mul method, of class Calculation.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        double result = Calculation.mul(this.a, this.b);
        assertEquals(result, this.mulExpected, 0.00001);
    }

    /**
     * Test of div method, of class Calculation.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        double result = Calculation.div(this.a, this.b);
        assertEquals(result, this.divExpected, 0.00001);
    }
    
}
