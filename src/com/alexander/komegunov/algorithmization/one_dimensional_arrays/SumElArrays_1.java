package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

/**
 * В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 */

public class SumElArrays_1 {

    public static int sumElements(byte[] array) {
        int sum = 0;
        for (int j : array) {
            if (j % array.length == 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumElements(new byte[] {1,3,5,6,7,8}));
    }
}
