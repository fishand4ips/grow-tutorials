package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

/**
 * Даны действительные числа а1 ,а2 ,..., аn.
 * Поменять местами наибольший и наименьший элементы.
 */

public class SwapMaxAndMinElement_4 {

    public static void swap(double[] seq) {
        System.out.println("Исходный массив: " + Arrays.toString(seq));
        changer(
                seq,
                findMinPosition(seq),
                findMaxPosition(seq),
                findMinValue(seq),
                findMaxValue(seq)
        );
        System.out.println("После перестановки max и min элементов: " + Arrays.toString(seq));
    }

    public static void changer(double[] seq, int positionMin, int positionMax, double min, double max) {
        for (int j = 0; j < seq.length; j++) {
            seq[positionMax] = min;
            seq[positionMin] = max;
        }
    }

    public static double findMinValue(double[] seq) {
        double min = seq[0];
        for (double v : seq) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    public static double findMaxValue(double[] seq) {
        double max = seq[0];
        for (double v : seq) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static int findMaxPosition(double[] seq) {
        double max = seq[0];
        int positionMax = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] > max) {
                positionMax = i;
            }
        }
        return positionMax;
    }

    public static int findMinPosition(double[] seq) {
        double min = seq[0];
        int positionMin = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] < min) {
                positionMin = i;
            }
        }
        return positionMin;
    }


    public static void main(String[] args) {
        swap(new double[]{1, 2, 0, 8, 3, 2, 1, 111, 5, 3});
    }
}
