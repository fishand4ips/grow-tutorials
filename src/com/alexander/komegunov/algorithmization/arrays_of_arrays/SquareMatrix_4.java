package com.alexander.komegunov.algorithmization.arrays_of_arrays;

import java.util.Arrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
 * Заданный образец - https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
 */

public class SquareMatrix_4 {
    public static void buildMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = n - j;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        buildMatrix(2);
    }
}
