package com.epam.test.automation.java.practice4;

public class Task4 {
  
    private static double sumGeometricElements(int a1, double t, int alim) {
        
        double a = a1;
	    double sum = a1;
	    if (a1 <= alim) {
	        throw new IllegalArgumentException("First element a1 has to be bigger than alim");
	    }
	    if (t<=0 || t>=1) {
	        throw new IllegalArgumentException("Step t has to be between 0 and 1");
	    }
	    if (alim < 0) {
	        throw new IllegalArgumentException("Last element alim has to be >= 0");
	    }
	    while (a > alim && a >= 0.00000001) {
			a *= t;
			if (a <= alim) {
				break;
			}
			sum +=a;
	    }
		return sum;
	}
}
