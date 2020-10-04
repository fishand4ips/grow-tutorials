package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

/**
 * Даны действительные числа a1, a2,..., an. Найти max(a1 + a2n, a2 + a2n,...)
 */

public class ArrayMax_7 {
    public static void main(String[] args) {
        System.out.println(max(new double[]{1, 2, 3, 4, 6, 7, 8, 5, 4, 3, 2, 4, 5}));
    }

    public static double max(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            max = Double.max(max, arr[i] + arr[j]);
        }
        return max;
    }
}
