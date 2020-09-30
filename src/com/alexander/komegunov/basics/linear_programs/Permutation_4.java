package com.alexander.komegunov.basics.linear_programs;

public class Permutation_4 {
    public static double perm(double full) {
        int integer = (int) full;
        double fractional = (full - integer);
        double integerModify = (double) integer / 1000;
        double fractionalModify = Math.round(fractional * 1000);
        return fractionalModify + integerModify;
    }


    public static void main(String[] args) {
        System.out.println(perm(111.999));
    }
}
