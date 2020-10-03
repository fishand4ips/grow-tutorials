package com.alexander.komegunov.basics.linear_programs;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
 * и false в противном случае.
 */

public class ExistPointsShadedArea_6 {
    public static boolean exist(int x, int y) {
        boolean flag = false;
        if (x <= 4 && y <= 0 && x >= -4 && y >= -3) {
            flag = true;
        }
        if (x <= 2 && x >= -2 && y >= 0 && y <= 4) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(exist(-1, 3));
    }
}