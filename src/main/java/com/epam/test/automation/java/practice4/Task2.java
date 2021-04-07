package com.epam.test.automation.java.practice4;

import java.util.Arrays;

private class Task2 {
   
   public static int[] transform(int[] array, SortOrder order) {		        
		int[] arrResult = Arrays.copyOf(array, array.length);
		if ((Task1.isSorted(array, SortOrder.ASC) && order == SortOrder.ASC) || (Task1.isSorted(array, SortOrder.DESC) && order == SortOrder.DESC)) {
		   for (int i=0; i<array.length; i++) {
		   arrResult[i] = array[i]+i;
		   }
		}
		return arrResult;	   
	}
}
