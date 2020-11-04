package com.alexander.komegunov.sorting;

/**
 * 1. Выбираем опорный элемент из массива. Как правило, это средний элемент.
 * 2. Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше опорного.
 * 3. Рекурсивно применяем сортировку к обоим подмассивам.
 */

public class QuickSort {
    private int[] numbers;

    public static void main(String[] args) {
        int[] ints = new int[]{1, 6, 3, 2, 4, 6, 7, 5, 3};
        QuickSort quick = new QuickSort();
        quick.print(ints);
        quick.leadTime(ints);
    }

    public void print(int[] numbers) {
        System.out.print("before: ");
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
        sort(numbers);
        System.out.print("after: ");
        for (int number : numbers) {
            System.out.print(number);
        }
    }

    private void leadTime(int[] numbers) {
        long start = System.nanoTime();
        sort(numbers);
        long finish = System.nanoTime();
        long timeConsumedMillis = finish - start;
        System.out.println("\n" + "times: " + timeConsumedMillis + "нс");
    }

    private void sort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        this.numbers = a;
        int number = a.length;
        quickSort(0, number - 1);
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high - low) / 2]; // выбор опорного элемента
        while (i <= j) {
            while (numbers[i] < pivot) { // элементы меньше опорного
                i++;
            }
            while (numbers[j] > pivot) { // элементы больше опорного
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}


