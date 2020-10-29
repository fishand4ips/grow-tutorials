package com.alexander.komegunov.different.compar;

import java.util.Comparator;

public class EmployeePositionComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getPosition().compareTo(employee2.getPosition());
    }
}
