package com.alexander.komegunov.basics.linear_programs;

import java.util.concurrent.TimeUnit;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах
 * и секундах в следующей форме: HHч MMмин SSс.
 */

public class SecondsConverter_5 {
    public static String converter(int t) {
        long hours = TimeUnit.SECONDS.toHours(t);
        long minutes = TimeUnit.SECONDS.toMinutes(t) - (TimeUnit.SECONDS.toHours(t) * 60);
        long seconds = TimeUnit.SECONDS.toSeconds(t) - (TimeUnit.SECONDS.toMinutes(t) * 60);
        return String.format("%02dч %02dмин %02dс", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(converter(3600));
    }
}
