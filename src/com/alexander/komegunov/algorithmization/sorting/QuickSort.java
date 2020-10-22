package com.alexander.komegunov.algorithmization.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 1. Выбираем опорный элемент из массива. Как правило, это средний элемент.
 * 2. Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше опорного.
 * 3. Рекурсивно применяем сортировку к обоим подмассивам.
 */

public class QuickSort {

    static void sort(Integer[] a) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        if (a.length < 2) {
            System.out.println(Arrays.toString(a));
        }
        int peson = a[0];
        for (Integer integer : a) {
            if (integer <= peson) {
                less.add(integer);
            }
            if (integer > peson) {
                greater.add(integer);
            }
        }
        Integer[] arrayLess = new Integer[less.size()];
        arrayLess = less.toArray(arrayLess);
        Integer[] arrayGreater = new Integer[greater.size()];
        arrayGreater = greater.toArray(arrayGreater);
        sort(arrayLess);
        sort(arrayGreater);

        Integer[] union = Stream.concat(Arrays.stream(arrayLess), Arrays.stream(arrayGreater))
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(union));
    }

    public static void main(String[] args) {
        sort(new Integer[]{9, 4, 4, 51, 2, 3, 4});
    }

}
