package com.alexander.komegunov.sorting;

import java.util.Arrays;

/**
 * Итерируемся слева направо, при этом при выполнении swap
 * элементов мы выполняем проверку всех остальных элементов,
 * которые остались позади, не нужно ли повторить swap.
 */

public class ShuttleSort {

    public static void main(String[] args) {
        final int[] ints = new int[]{1, 5, 3, 2, 4, 67, 8, 6, 4};
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void swap(int[] a, int i1, int i2) {
        int tmp = a[i1];
        a[i1] = a[i2];
        a[i2] = tmp;
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                swap(a, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (a[z] < a[z - 1]) {
                        swap(a, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
