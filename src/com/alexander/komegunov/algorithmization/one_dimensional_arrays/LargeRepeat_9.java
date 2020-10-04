package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

import java.util.HashMap;

/**
 * В массиве целых чисел с количеством элементов n
 * найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class LargeRepeat_9 {
    public static int findDuplicateInArray(int[] sequence) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        int max = 1;
        for (int arrayItem : sequence) {
            if (map.putIfAbsent(arrayItem, 1) != null) {
                int count = map.get(arrayItem) + 1;
                map.put(arrayItem, count);
                if (count > max) {
                    max = count;
                    result = arrayItem;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateInArray(new int[]{1, 3, 4, 5, 6, 7, 7, 5, 4, 3}));
    }
}
