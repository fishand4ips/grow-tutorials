package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Дана последовательность целых чисел a1, a2, ... , an .
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1, a2, ... , an).
 */

public class ExcludeMinElements_8 {
    public void exclude(ArrayList<Integer> seq) {
        final Integer min = Collections.min(seq);
        seq.removeAll(Collections.singleton(min));
    }

    public static void main(String[] args) {
        ExcludeMinElements_8 obj = new ExcludeMinElements_8();
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(1);
        seq.add(2);
        seq.add(3);
        seq.add(4);
        seq.add(1);
        seq.add(5);
        seq.add(6);
        System.out.println("исходная: " + seq);
        obj.exclude(seq);
        System.out.println("преобразованная: " + seq);
    }
}
