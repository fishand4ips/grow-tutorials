package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

/**
 * Даны целые числа а1 ,а2 ,..., аn.
 * Вывести на печать только те числа, для которых аi > i.
 */

public class Array_5 {
    public static void compute(byte[] seq) {
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] > i) {
                System.out.print(seq[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        compute(new byte[]{5, 4, 2, 4, 6, 8, 9, 6, 4, 3});
    }
}
