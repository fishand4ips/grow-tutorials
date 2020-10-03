package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public class Array_2 {

    public static int compute(byte[] array) {
        double z = Math.random() * 10;
        int counter = 0;
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = (byte) z;
                counter++;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(array));
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Количество замен: " + compute(new byte[]{1, 2, 13, 4, 5, 6, 7, 5, 3, 2, 24, 5, 4, 3, 2}));
    }
}
