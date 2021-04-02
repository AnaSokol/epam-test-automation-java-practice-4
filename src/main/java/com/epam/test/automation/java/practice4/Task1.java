package com.epam.test.automation.java.practice4;
import java.util.Arrays;

public class Task1 {

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        if (order == SortOrder.ASC){
           for (int i = 1; i < array.length; i++) {
               if (array[i] < array[i-1]) {
                   return false;
               }
           }
        }else  if (order == SortOrder.DESC){
           for (int i = 1; i < array.length; i++) {
        	   if (array[i] > array[i-1]) {
        		   return false;  
        	   }
           }
        }

         return true;
    }
}
