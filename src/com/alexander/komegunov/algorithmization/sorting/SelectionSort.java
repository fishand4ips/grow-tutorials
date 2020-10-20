package com.alexander.komegunov.algorithmization.sorting;

import java.util.Arrays;

/**
 * СОРТИРОВКА ВСТАВКАМИ:
 * это сортировка сравнения на месте. Он зацикливается и находит первое наименьшее значение,
 * заменяет его первым элементом; зациклите и снова найдите второе наименьшее значение,
 * поменяйте его местами со вторым элементом, повторите третье, четвертое, пятое наименьшее
 * значение и поменяйте местами, пока все не будет в правильном порядке
 */

public class SelectionSort {
    public static void main(String[] args) {
        final int[] ints = {1, 1, 6, 1, 2, 4, 3, 2, 4, 12, 2, 2, 7};
        System.out.println("before: " + Arrays.toString(ints));
        sort(ints);
        System.out.println("after: " + Arrays.toString(ints));

    }

    static void sort(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < sequence.length; j++) {
                if (sequence[j] > sequence[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = sequence[maxIndex];
            sequence[maxIndex] = sequence[i];
            sequence[i] = tmp;
        }
    }
}
