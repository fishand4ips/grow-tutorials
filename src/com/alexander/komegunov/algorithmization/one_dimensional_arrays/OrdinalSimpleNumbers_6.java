package com.alexander.komegunov.algorithmization.one_dimensional_arrays;

/**
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class OrdinalSimpleNumbers_6 {

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[] arr = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 6, 4, 3, 2};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма чисел с простыми индексами: " + sum);

    }
}
