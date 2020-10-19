package com.alexander.komegunov.algorithmization.sorting;

import java.util.Arrays;

/**
 * СОРТИРОВКА ВСТАВКАМИ:
 * Просто и незатейливо — проходим по массиву в поисках максимального элемента.
 * Найденный максимум меняем местами с последним элементом.
 * Неотсортированная часть массива уменьшилась на один элемент (не включает последний элемент,
 * куда мы переставили найденный максимум). К этой неотсортированной
 * части применяем те же действия — находим максимум и ставим его на последнее место в неотсортированной части массива.
 * И так продолжаем до тех пор, пока неотсортированная часть массива не уменьшится до одного элемента.
 */

public class SelectionSort {
    public static void main(String[] args) {
        sort(new int[]{1, 1, 6, 1, 2, 4, 3, 2, 4, 12, 2, 2, 7});
    }

    static void sort(int[] sequence) {
        System.out.println("before " + Arrays.toString(sequence));
        int maxVal = sequence[0], maxPos = 0, lastPos, tmp;
        for (int i = 0; i < sequence.length; i++) {
            lastPos = sequence.length - i - 1;
            for (int j = 0; j < sequence.length - i; j++) {
                if (sequence[j] > maxVal) {
                    maxVal = sequence[j];
                    maxPos = j;
                }
            }
            tmp = sequence[maxPos];
            sequence[maxPos] = sequence[lastPos];
            sequence[lastPos] = tmp;
        }
        System.out.println("after " + Arrays.toString(sequence));
    }

}
