package com.epam.test.automation.java.practice4;

private class Task3 {

   public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0) {
        	throw new IllegalArgumentException("Value of n should be more than 0");
        }
        int a = a1;
        int result = a1;
        for (int i=1; i<n; i++) {
        	a += t;
        	result *= a;
        }
		return result;
        
    }
}
