package com.alexander.komegunov.basics.cycles;

public class SumSquare_3 {
    public static void main(String[] args) {
        System.out.println(calc());
    }

    public static int calc() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
