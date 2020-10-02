package com.alexander.komegunov.basics.branching;

/**
 * Даны три точки A(x1,y1), B(x2,y2), C(x3,y3).
 * Определить, будут ли они расположены на одной прямой.
 */

public class LocationPointsOutline_3 {
    // use canonical equation of a straight line on a plane
    public static boolean location(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1);
    }

    public static void main(String[] args) {
        System.out.println(location(1, 1, 2, 2, 3, 3));
    }
}
