package com.alexander.komegunov.basics.linear_programs;

public class ExpressionValue_2 {
    public static double calculate(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);
    }

    public static void main(String[] args) {
        System.out.println(calculate(1,2,3));
    }
}
