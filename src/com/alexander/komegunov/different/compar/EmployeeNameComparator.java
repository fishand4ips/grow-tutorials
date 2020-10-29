package com.alexander.komegunov.different.compar;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employeeFirst, Employee employeeSecond) {
        return employeeFirst.getName().compareTo(employeeSecond.getName());
    }
}
