package sorting;

import java.util.ArrayList;
import java.util.Arrays;
//For small arrays (length < 17), use the Insertion sort algorithm.
/*
 * @author Misha
 */
public class Insertion {
     
    ArrayList<Integer> sorted;
    int unsorted[];
    
    
    public Insertion(int array[])
    {
      unsorted=array; 
    }
    
    
    public void sort()
    {
      
        for(int i=1;i<unsorted.length-1;i++)
         {    
             for(int j=i;j>0;j--){
                 if(unsorted[j]<unsorted[j-1]){
                  int temp= unsorted[j];
                  unsorted[j]=unsorted[j+1];
                  unsorted[j+1]=temp;                 
                 
                 }
           
             }
            
         }
        System.out.println("Insertion Sort"+Arrays.toString(unsorted));
     //sorted=new ArrayList<Integer>(Arrays.toString(unsorted));
     //  return sorted;
    
}
}
