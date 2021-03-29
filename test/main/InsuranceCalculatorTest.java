/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author lohir
 */
public class InsuranceCalculatorTest {
    
    public InsuranceCalculatorTest() {
    }

//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        InsuranceCalculator.main(args);
//        //fail("The test case is a prototype.");
//    }

    @Test
    public void testCalculateLifeInsurance() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        int age = 20;
        double expResult = 400.0;
        double result = InsuranceCalculator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceCalculator.calculateLifeInsurance(-1)
        });
    }
}
