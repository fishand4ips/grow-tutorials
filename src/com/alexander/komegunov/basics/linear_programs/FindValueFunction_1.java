package com.alexander.komegunov.basics.linear_programs;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class FindValueFunction_1 {
    public static int calculate(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3));
    }
}
