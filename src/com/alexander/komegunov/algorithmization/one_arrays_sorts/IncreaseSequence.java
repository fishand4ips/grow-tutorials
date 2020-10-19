package com.alexander.komegunov.algorithmization.one_arrays_sorts;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Даны две последовательности a1, a2,... ,an и b1, b2,... ,bm.
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 */

public class IncreaseSequence {

    public static ArrayList<Integer> concatNonDecrease(ArrayList<Integer> seq1, ArrayList<Integer> seq2) {
        seq1.addAll(seq2);
        Collections.sort(seq1);
        return seq1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);

        System.out.println(concatNonDecrease(s1, s2));
    }
}
