package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

public class SwapMaxAndMinElement_4 {

    public static void swap(byte[] seq) {
        int max = seq[0];
        int min = seq[0];
        int positionMax = 0;
        int positionMin = 0;
        System.out.println("Исходный массив: " + Arrays.toString(seq));
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] > max) {
                max = seq[i];
                positionMax = i;
            }
            if (seq[i] < min) {
                min = seq[i];
                positionMin = i;
            }
        }
        for (int j = 0; j < seq.length; j++) {
            seq[positionMax] = (byte) min;
            seq[positionMin] = (byte) max;
        }
        System.out.println("После перестановки max и min элементов: " + Arrays.toString(seq));
    }

    public static void main(String[] args) {
        swap(new byte[]{1, 2, 0, 8, 3, 2, 1, 111, 5, 3});
    }
}
