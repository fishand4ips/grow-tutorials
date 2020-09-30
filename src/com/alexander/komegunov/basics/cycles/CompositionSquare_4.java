package com.alexander.komegunov.basics.cycles;

public class CompositionSquare_4 {
    public static long composition() {
        long multiple = 1;
        for (int i = 1; i <= 200; i++) {
            multiple *= Math.pow(i, 2);
        }
        return multiple;
    }

    public static void main(String[] args) {
        System.out.println(composition());
    }
}
