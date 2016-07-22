package sorting;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @author Misha
 */

/*
Especially when we don't have random access. External Sorting.

*/
public class MergeSort {
     ArrayList<Integer> sorted;
     int s[];
    int unsorted[];
    
    
    public MergeSort(int array[])
    {
      unsorted=array; 
    }
    
    public void merge(int a[],int l,int mid,int r)
    {
         int indexl=l;
         int indexr=mid+1;
         int indext=l;
         int[] temp = new int[r-l+1];
         while(indexl<=mid && indexr<=r)    
         {
             if(a[indexl]<a[indexr]){
              temp[indext]=a[indexl]; indext++;indexl++; }
             else
             {temp[indext]=a[indexr]; indext++;indexr++; }
        }
         if(indexl<mid)
         { 
             temp[indext]=a[indexl]; 
             indext++;indexl++; 
         }
         if(indexr<=r)
         { 
             temp[indext]=a[indexr]; 
             indext++;indexr++; 
         }
         indext=l;
         while(indext<=r){
             a[indext]=temp[indext];
             indext++;
             
         }
         System.out.println("L is"+ l+ " R is "+r+Arrays.toString(a));
 
    }
        
    public void mergesort(int a[],int l,int r)
    {
        if(l<r){
          int mid=(r-l)/2;
          System.out.println("after calculating mid");
          mergesort(a,l,mid);
          System.out.println("after mergesort(a,l,mid);");
          mergesort(a,mid+1,r);
          System.out.println("after mergesort(a,mid+1,r);");
          merge(a,l,mid,r);
          System.out.println("after merge(a,l,mid,r);");
         
        }
    }
    
    
    public void sort()
    {
        mergesort(unsorted,0,unsorted.length-1);
        System.out.println(Arrays.toString(s));
    }
    
}
