package com.alexander.komegunov.dynamic_programming;

import java.util.Scanner;

/**
 * Program to implement Kadane’s Algorithm to
 * calculate maximum contiguous subarray sum of an array
 */

public class Kadane {

    static int largestContiguousSum(int[] arr) {
        int i, len = arr.length, cursum = 0, maxsum = Integer.MIN_VALUE;
        if (len == 0)
            return 0;
        for (i = 0; i < len; i++) {
            cursum += arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum <= 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int i;
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Заполните массив из " + n + " элементов целыми числами: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxContSum = largestContiguousSum(arr);
        System.out.println("Результат алгоритма: " + maxContSum);
        sc.close();
    }

}

