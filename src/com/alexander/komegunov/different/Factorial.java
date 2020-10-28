package com.alexander.komegunov.different;

import javax.swing.*;

public class Factorial {
    /**
     * Checking correct operation
     * @param args
     */
    public static void main(String[] args) {
        final String input = JOptionPane.showInputDialog("Введи положительное число ");
        JOptionPane.showMessageDialog(null, "Факториал " + input + ": " + factorial(Integer.parseInt(input)));
    }

    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative number");
        }
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}