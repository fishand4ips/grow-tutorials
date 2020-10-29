package com.alexander.komegunov.different.compar;

import java.util.Comparator;

public enum PositionsEmployees {
    JUNIOR(1),
    MIDDLE(2),
    LEAD(4),
    SENIOR(3),
    TRAINEE(0);

    private final int size;

    PositionsEmployees(int size) {
        this.size = size;
    }

    public static Comparator<PositionsEmployees> getSizeComparator() {
        return Comparator.comparingInt(PositionsEmployees::getSize);
    }

    public int getSize() {
        return size;
    }
}
