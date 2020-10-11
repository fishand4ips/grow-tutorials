package com.alexander.komegunov.algorithmization.arrays_of_arrays;

import java.util.Scanner;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы,
 * у которых первый элемент больше последнего.
 */

public class Matrix_1 {
    public static void main(String[] args) {
        int[][] matrixA;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j += 2) {
                if (matrixA[0][j] > matrixA[m - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
