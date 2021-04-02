package com.epam.test.automation.java.practice4;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] tAsc = new int[array.length];
        tAsc = array;
        Arrays.sort(tAsc);
        int[] tDesc = new int[array.length];
        tDesc = array;
        Arrays.stream(tDesc).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        if (array == tAsc || array == tDesc) {
            return true;
        }
            return false;
    }
}
