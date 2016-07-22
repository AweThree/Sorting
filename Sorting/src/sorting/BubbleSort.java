
package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 
 * @author Misha
 */
public class BubbleSort 
{
    ArrayList<Integer> sorted;
    int unsorted[];
    
    
    public BubbleSort(int array[])
    {
      unsorted=array; 
    }
    
    
    public void sort()
    {
        int flag; 
        for(int i=0;i<unsorted.length-1;i++)
         {     flag=0;
             for(int j=0;j<unsorted.length-1;j++){
                 if(unsorted[j]>unsorted[j+1]){
                  int temp= unsorted[j];
                  unsorted[j]=unsorted[j+1];
                  unsorted[j+1]=temp;                 
                  flag=1;
                 }
                  
             
             }
             if(flag==0)
                  break;
         }
        System.out.println("Bubble Sort"+Arrays.toString(unsorted));
     //sorted=new ArrayList<Integer>(Arrays.toString(unsorted));
//     return sorted;
}}
