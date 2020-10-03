package com.alexander.komegunov.basics.branching;

/**
 * Найти max{min(a, b), min(c, d)}.
 */

public class MaxOutMin_2 {

    public static int maxMin(int a, int b, int c, int d) {
        int minAB = 0;
        int minCD = 0;
        if (a < b) {
            minAB = a;
        } else {
            minAB = b;
        }
        if (c < d) {
            minCD = c;
        } else {
            minCD = d;
        }
        if (minAB < minCD) {
            return minCD;
        } else {
            return minAB;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxMin(1, 2, 3, 4));
    }
}
