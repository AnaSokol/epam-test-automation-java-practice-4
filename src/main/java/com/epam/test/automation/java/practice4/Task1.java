package com.epam.test.automation.java.practice4;

public class Task1 {

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] t = new int[array.length];
        t = array;
        SortOrder.ASC (t);
        if (t == array) {
            return true;
        }
            return false;
        }
    }
}
