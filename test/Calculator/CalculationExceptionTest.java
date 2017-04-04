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
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * https://www.tutorialspoint.com/junit/junit_parameterized_test.html
 * @author Thien
 */ 

@RunWith(Parameterized.class)
public class CalculationExceptionTest {
    
    @Rule
    public ExpectedException thrown= ExpectedException.none();
    
    private String a;
    private String b;
    private String plusExpected;
    private String minusExpected;
    private String mulExpected;
    private String divExpected;
    public CalculationExceptionTest(String a, String b, String plusExpected, String minusExpected, String mulExpected, String divExpected) {
        this.a = a.trim();
        this.b = b.trim();
        plusExpected = plusExpected.trim();
        minusExpected = minusExpected.trim();
        mulExpected = mulExpected.trim();
        divExpected = divExpected.trim();
        this.plusExpected = plusExpected;
        this.minusExpected = minusExpected;
        this.mulExpected = mulExpected;
        this.divExpected = divExpected;
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
        CSVReader reader = new CSVReader(new FileReader("test_data_exception.csv"));
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
        System.out.println(this.plusExpected);  
        if (this.plusExpected.equals("y")){
            thrown.expect(Exception.class);
        }
        double result = Calculation.plus(this.a, this.b);
        
        // TODO review the generated test code and remove the default call to fail.
    }

//    /**
//     * Test of minus method, of class Calculation.
//     */
    @Test
    public void testMinus() {
        System.out.println("minus");  
        if (this.minusExpected.equals("y")){
            thrown.expect(Exception.class);
        }        
        double result = Calculation.minus(this.a, this.b);
    }

    /**
     * Test of mul method, of class Calculation.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        if (this.mulExpected.equals("y")){
            thrown.expect(Exception.class);
        }                
        double result = Calculation.mul(this.a, this.b);

    }

    /**
     * Test of div method, of class Calculation.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        if (this.divExpected.equals("y")){
            thrown.expect(Exception.class);
        }                        
        double result = Calculation.div(this.a, this.b);

    }
    
}
