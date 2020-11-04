package com.alexander.komegunov.searches;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 * Binary search is one of the most popular algorithms
 * The algorithm finds the position of a target value within a sorted array.
 */

class BinarySearch implements SearchAlgorithm {

    @Override
    public  <T extends Comparable<T>> int find(T[] array, T key) {
        return search(array, key, 0, array.length);
    }

    private <T extends Comparable<T>> int search(T[] array, T key, int left, int right){
        if (right < left) return -1;

        int median = (left + right) >>> 1;
        int comp = key.compareTo(array[median]);

        if (comp == 0) {
            return median;
        } else if (comp < 0) {
            return search(array, key, left, median - 1);
        } else {
            return search(array, key, median + 1, right);
        }
    }

    public static void main(String[] args) {
        Random r = ThreadLocalRandom.current();
        final int size = 100;
        final int maxElement = 100000;

        Integer[] integers = IntStream.generate(() -> r.nextInt(maxElement)).limit(size).sorted().boxed().toArray(Integer[]::new);
        int shouldBeFound = integers[r.nextInt(size - 1)];

        BinarySearch search = new BinarySearch();
        int atIndex = search.find(integers, shouldBeFound);

        System.out.printf("Should be found: %d. Found %d at index %d. An array length %d%n",
                shouldBeFound, integers[atIndex], atIndex, size);

        int toCheck = Arrays.binarySearch(integers, shouldBeFound);
        System.out.printf("Found by system method at an index: %d. Is equal: %b%n",
                toCheck, toCheck == atIndex);
    }
}
