/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author Misha
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,4,33,2,1};
        Integer[] input = {24,2,45,20,56,75,2,56,99,53,12};
        BubbleSort bs=new BubbleSort(a);
        bs.sort();
        Insertion is=new Insertion(a);
        is.sort();
//        MergeSort ms=new MergeSort(a);
//        ms.sort();
       QuickSort qs = new QuickSort();       
        qs.sort(input);
        System.out.println("Quicksort: "+Arrays.toString(input));

    }
    
}
