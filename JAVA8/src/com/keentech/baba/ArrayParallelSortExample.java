package com.keentech.baba;

/**
 * To sort array elements in parallel
 * New methods has added to java.util.Arrays package.
 * It uses the JSR 166 Fork/Join parallelism common pool to provide sorting of arrays in parallel.
 * The methods are called parallelSort() and are overloaded for all the primitive data types and Comparable objects.
 */
import java.util.Arrays;  
public class ArrayParallelSortExample {  
    public static void main(String[] args) {  
        // Creating an integer array   
        int[] arr = {5,8,1,0,6,9};  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel  
        Arrays.parallelSort(arr);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : arr) {  
            System.out.print(i+" ");  
        }  
    }  
}  