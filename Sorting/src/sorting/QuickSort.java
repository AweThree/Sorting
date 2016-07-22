package sorting;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * @author Misha
 */
public class QuickSort {
     ArrayList<Integer> sorted;
     int s[];
     int unsorted[];
 
     
     
     private static <T extends Comparable<T>> int split(T[] list, int low,int hi){
         
         int left=low+1;
         int right=hi;
         T pivot = list[low];
         
         while(left<=right){
                              
             
             
            while(list[left].compareTo(pivot)<0)    //not <=
                left++;
            while(list[right].compareTo(pivot)>0)   //not>= 
                right--;
            if(left>=right)
                break;
            
         T temp=list[left];
         list[left]=list[right];
         list[right]=temp;
         left++;right--;
         
         
     }
         // pivot should be at 1 index before left
         list[low]=list[left-1];
         list[left-1]=pivot;
         
         
         return left-1;
     }
     
     private static <T extends Comparable<T>> void sort(T[] list, int low, int hi){
         
      if(low>=hi)
          return;
      int splitpoint=split(list,low,hi);
      sort(list,low,splitpoint-1);
      sort(list,splitpoint+1,hi);
     }
 
     
     public static <T extends Comparable<T>> void sort(T[] list)
     {
      if(list.length<=1)
      {
        return;
      }
      sort(list,0,list.length-1);
     }
     
}



