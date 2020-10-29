package com.alexander.komegunov.different.compar;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employeeFirst, Employee employeeSecond) {
        return Integer.compare(employeeFirst.getAge(), employeeSecond.getAge());
    }
}