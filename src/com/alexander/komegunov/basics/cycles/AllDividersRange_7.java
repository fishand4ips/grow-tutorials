package com.alexander.komegunov.basics.cycles;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести
 * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class AllDividersRange_7 {

    public static void dividers(int m, int n) {
        if (m > n) {
            System.err.println("Не правильно задан диапазон (нижняя граница" +
                    " должна быть меньше верхней границы)");
        }
        m = m + 1;
        while (m < n) {
            System.out.print("m = " + m + ", делители: ");
            for (int i = 2; i < m; i++) {
                if ((m % i) == 0) {
                    System.out.print(i + " ");
                }
            }
            m += 1;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите нижнюю границу: ");
        int m = scanner.nextInt();
        System.out.print("Введите верхнюю границу: ");
        int n = scanner.nextInt();
        dividers(m, n);
    }
}
