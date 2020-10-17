package com.alexander.komegunov.algorithmization.one_arrays_sorts;

import java.util.Arrays;

/**
 * Объединить два одномерных массива
 */

public class UnionArrays {
    public static int[] concat(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }
        int[] result = new int[length];
        int pos = 0;
        for (int[] array : arrays) {
            for (int element : array) {
                result[pos] = element;
                pos++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concat(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4, 5, 3, 2})));
    }
}
