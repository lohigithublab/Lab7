package main;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHigherNumbersTest {
    
    public ArrayHigherNumbersTest() {
    }

    @Test
    public void testGetCountGreaterthan_N_As_30_InArrayList() {
        System.out.println("getCountGreaterthanNValue");
        int n_Number = 30;
        ArrayList<Integer> obj_Integer_ArrayList = new ArrayList<Integer>();
        obj_Integer_ArrayList.add(10);
        obj_Integer_ArrayList.add(20);
        obj_Integer_ArrayList.add(30);
        obj_Integer_ArrayList.add(40);
        obj_Integer_ArrayList.add(50);
        obj_Integer_ArrayList.add(60);
        obj_Integer_ArrayList.add(70);
        obj_Integer_ArrayList.add(80);
        obj_Integer_ArrayList.add(90);
        obj_Integer_ArrayList.add(100);
         
        int expResult = 7;
        int result = ArrayHigherNumbers.getCountGreaterthanNValue(n_Number, obj_Integer_ArrayList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCountGreaterthan_N_As_40_InArrayList() {
        System.out.println("getCountGreaterthanNValue");
        int n_Number = 40;
        ArrayList<Integer> obj_Integer_ArrayList = new ArrayList<Integer>();
        obj_Integer_ArrayList.add(10);
        obj_Integer_ArrayList.add(20);
        obj_Integer_ArrayList.add(30);
        obj_Integer_ArrayList.add(40);
        obj_Integer_ArrayList.add(50);
        obj_Integer_ArrayList.add(60);
        obj_Integer_ArrayList.add(70);
        obj_Integer_ArrayList.add(80);
        obj_Integer_ArrayList.add(90);
        obj_Integer_ArrayList.add(100);
         
        int expResult = 6;
        int result = ArrayHigherNumbers.getCountGreaterthanNValue(n_Number, obj_Integer_ArrayList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCountGreaterthan_N_As_110_InArrayList_Failure() {
        System.out.println("getCountGreaterthanNValue");
        int n_Number = 110;
        ArrayList<Integer> obj_Integer_ArrayList = new ArrayList<Integer>();
        obj_Integer_ArrayList.add(10);
        obj_Integer_ArrayList.add(20);
        obj_Integer_ArrayList.add(30);
        obj_Integer_ArrayList.add(40);
        obj_Integer_ArrayList.add(50);
        obj_Integer_ArrayList.add(60);
        obj_Integer_ArrayList.add(70);
        obj_Integer_ArrayList.add(80);
        obj_Integer_ArrayList.add(90);
        obj_Integer_ArrayList.add(100);
         
        int expResult = 11;
        int result = ArrayHigherNumbers.getCountGreaterthanNValue(n_Number, obj_Integer_ArrayList);
        assertNotEquals(expResult, result);
    }


}
