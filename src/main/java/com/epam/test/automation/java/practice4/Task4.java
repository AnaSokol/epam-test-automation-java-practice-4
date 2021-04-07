package com.epam.test.automation.java.practice4;

public class Task4 {
  
    public static double sumGeometricElements(int a1, double t, int alim) {
        double sum = 0;
        if (t > 0 && t < 1 && a1 > alim && alim >= 0) {
            double a = a1;
            while (a > alim && a>= 0.00000001) {
                sum += a;
                a *= t;
            }
        } else {
            throw new java.lang.IllegalArgumentException("Wrong argument entered. Check conditions: a1>alim; 0>t>1");
        }
        return java.lang.Math.round(sum);
    }
}
