package com.epam.test.automation.java.practice4;

public class Task4 {
  
    private static double sumGeometricElements(int a1, double t, int alim) {
	   if (a1 <= alim) {
	       throw new IllegalArgumentException("First element a1 has to be bigger than alim");
	   }
	   if (t<=0 || t>=1) {
	       throw new IllegalArgumentException("Step t has to be between 0 and 1");
	   }
	    double a = a1;
	    double sum = a1;
		while (a > alim) {
			a *= t;
			if (a <= alim) {
				break;
			}
			sum +=a;
		}
		return sum;
	}
}
