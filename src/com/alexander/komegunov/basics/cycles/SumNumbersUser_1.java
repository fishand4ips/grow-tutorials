package com.alexander.komegunov.basics.cycles;

import java.util.Scanner;

public class SumNumbersUser_1 {

    public static String sum() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.print("Введите целое положительное число - ");
        int numbersUser = scanner.nextInt();
        for (int i = 1; i <= numbersUser; i++) {
            result += i;
        }
        return "Сумма чисел до введенного вами числа - " + result;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
