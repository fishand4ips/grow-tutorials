package com.alexander.komegunov.basics.branching;

public class ExistTriangle_1 {
    public static void triangle(int a, int b) {
        if (a + b >= 180) {
            System.out.println("Такого треугольника не существует");
        } else if (a == 90 || b == 90) {
            System.out.println("Треугольник является прямоугольным");
        } else {
            System.out.println("Такой треугольник существует");
        }
    }

    public static void main(String[] args) {
        triangle(160, 45);
    }
}
