package com.alexander.komegunov.different.compar;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> employeesComparable = new TreeSet<>();
        employeesComparable.add(new Employee("A", 15, PositionsEmployees.JUNIOR));
        employeesComparable.add(new Employee("BB", 11, PositionsEmployees.MIDDLE));
        employeesComparable.add(new Employee("CCC", 12, PositionsEmployees.TRAINEE));
        employeesComparable.add(new Employee("DDDD", 9, PositionsEmployees.LEAD));
        employeesComparable.add(new Employee("TTTTT", 20, PositionsEmployees.SENIOR));
        System.out.println("comparable: " + employeesComparable);

        Comparator<Employee> cemployee = new EmployeeNameComparator().thenComparing(new EmployeeAgeComparator().thenComparing(new EmployeePositionComparator()));
        TreeSet<Employee> employeesComparator = new TreeSet<>(cemployee);
        employeesComparator.add(new Employee("A", 12, PositionsEmployees.LEAD));
        employeesComparator.add(new Employee("A", 12, PositionsEmployees.JUNIOR));
        employeesComparator.add(new Employee("A", 16, PositionsEmployees.JUNIOR));
        employeesComparator.add(new Employee("A", 12, PositionsEmployees.MIDDLE));
        employeesComparator.add(new Employee("A", 15, PositionsEmployees.LEAD));
        System.out.println("comparator: " + employeesComparator);
    }
}
