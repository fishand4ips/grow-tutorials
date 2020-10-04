package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * Дан целочисленный массив с количеством элементов n.
 * Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями)
 */

public class RemoveEverySecondElement_10 {

    public static void rmvEverySecond(int[] array) {
        System.out.println("исходный: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println("преобразованный: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        rmvEverySecond(new int[]{1, 2, 3, 4, 5, 6});
    }
}
