package main;

import java.util.ArrayList;

public class AggregateMethodsForArray 
{
    public double SumOfTotalArrayValues(double[] d_Array)
    {
        double sum =  0.0;
        
        for(int i = 0; i < d_Array.length; i++)
        {
          sum = sum + d_Array[i];  
        }
        return sum;
    }
    
    public double AvgOfTotalArrayValues(double[] d_Array)
    { 
        double avg =  0.0;
        AggregateMethodsForArray obj_AggregateMethodsForArray = new AggregateMethodsForArray();
        avg = (obj_AggregateMethodsForArray.SumOfTotalArrayValues(d_Array))/d_Array.length;
        return avg;
    }
     
    public double MaxValueInTotalArrayValues(double[] d_Array)
    {
        double maxValue =  0.0;
        for(int i =0; i <d_Array.length; i++)
        {
            if(d_Array[i] > maxValue)
                maxValue = d_Array[i];
        }
        return maxValue;
    }
      
    public double MinValueInTotalArrayValues(double[] d_Array)
    {
        double minValue =  0.0;
        for(int i =0; i < d_Array.length; i++)
        {
            if(minValue == 0.0)
            {
                minValue = d_Array[0];
            }
            if(d_Array[i] < minValue)
                minValue = d_Array[i];
        }
        return minValue;
    }  
    
    public static void main(String[] args)
    {
        double[] obj_O_D_A  = {10,80,30,100,50,60,70,80,40,20}; 
        
        AggregateMethodsForArray objAggregateMethodsForArray = new AggregateMethodsForArray();
        
        double sum = objAggregateMethodsForArray.SumOfTotalArrayValues(obj_O_D_A);
        double avg = objAggregateMethodsForArray.AvgOfTotalArrayValues(obj_O_D_A);
        double max = objAggregateMethodsForArray.MaxValueInTotalArrayValues(obj_O_D_A);
        double min = objAggregateMethodsForArray.MinValueInTotalArrayValues(obj_O_D_A); 
        
        System.out.println("Sum of the elements in the array is: "+sum);
        System.out.println("Average of the elements in the array is: "+avg);
        System.out.println("Maximum value of the elements in the array is: "+max);
        System.out.println("Minimum value of the elements in the array is: "+min);   
    }
}
