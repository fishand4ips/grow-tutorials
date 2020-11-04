package com.alexander.komegunov.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = {1, 8, 6, 43, 3, 2, 4, 5, 6, 4, 3, 5, 6, 7, 4};
        System.out.println(Arrays.toString(ints));
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    static void sort(int[] a) {
        boolean isSortable = false;
        while (!isSortable) {
            isSortable = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSortable = false;
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }
}
