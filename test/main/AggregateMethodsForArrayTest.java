package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class AggregateMethodsForArrayTest {
    
    public AggregateMethodsForArrayTest() {
    }

    @Test
    public void testSumOfTotalArrayValues() {
        System.out.println("SumOfTotalArrayValues");
        double[] obj_O_D_A  = {10,80,30,100,50,60,70,80,40,20}; 
        AggregateMethodsForArray instance = new AggregateMethodsForArray();
        double expResult = 540.0;
        double result = instance.SumOfTotalArrayValues(obj_O_D_A);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAvgOfTotalArrayValues() {
        System.out.println("AvgOfTotalArrayValues");
        double[] obj_O_D_A  = {10,80,30,100,50,60,70,80,40,20};
        AggregateMethodsForArray instance = new AggregateMethodsForArray();
        double expResult = 54.0;
        double result = instance.AvgOfTotalArrayValues(obj_O_D_A);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMaxValueInTotalArrayValues() {
        System.out.println("MaxValueInTotalArrayValues");
        double[] obj_O_D_A  = {10,80,30,100,50,60,70,80,40,20};
        AggregateMethodsForArray instance = new AggregateMethodsForArray();
        double expResult = 100.0;
        double result = instance.MaxValueInTotalArrayValues(obj_O_D_A);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMinValueInTotalArrayValues() {
        System.out.println("MinValueInTotalArrayValues");
        double[] obj_O_D_A  = {10,80,30,100,50,60,70,80,40,20};
        AggregateMethodsForArray instance = new AggregateMethodsForArray();
        double expResult = 10.0;
        double result = instance.MinValueInTotalArrayValues(obj_O_D_A);
        assertEquals(expResult, result, 0.0);
    }
}
