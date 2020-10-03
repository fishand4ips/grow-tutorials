package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class ArrayCount_3 {
    public static String compute(byte[] sequenceArray) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println(Arrays.toString(sequenceArray));
        for (byte b : sequenceArray) {
            if (b < 0) {
                negative++;
            } else if (b > 0) {
                positive++;
            } else {
                zero++;
            }
        }
        return String.format("Количество положительных: %d, отрицательных: %d, нулевых: %d элементов", positive, negative, zero);
    }

    public static void main(String[] args) {
        System.out.println(compute(new byte[]{
                1, 2, 3, 0, 0, -1, -5, 1, 2, -5, 0
        }));
    }
}
