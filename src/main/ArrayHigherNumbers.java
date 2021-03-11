package main;

import java.util.ArrayList; 
import java.util.Scanner;

public class ArrayHigherNumbers {
    public static int getCountGreaterthanNValue(int n_Number, ArrayList IntArray)
    {
        int count = 0;
        
        for(int i =0; i < IntArray.size(); i++)
        {
             if(Integer.parseInt(IntArray.get(i).toString()) > n_Number)
             {
                 count = count + 1;
             }
        }
        return count;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> obj_Integer_ArrayList = new ArrayList<>();
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
         
        Scanner obj_InputScanner = new Scanner(System.in);
        System.out.println("Enter a number in between 1-100");
        int n_Number = obj_InputScanner.nextInt();
        int count = getCountGreaterthanNValue(n_Number, obj_Integer_ArrayList);
        System.out.println("Values count in an arraylist that are greater that the Given Number is: " + count);
    }
}
