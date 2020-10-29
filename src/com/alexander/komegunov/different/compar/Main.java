package com.alexander.komegunov.different.compar;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> employeesComparable = new TreeSet<>();
        employeesComparable.add(new Employee("A", 15));
        employeesComparable.add(new Employee("BB", 11));
        employeesComparable.add(new Employee("CCC", 12));
        employeesComparable.add(new Employee("DDDD", 9));
        employeesComparable.add(new Employee("TTTTT", 20));
        System.out.println("comparable: " + employeesComparable);

        Comparator<Employee> cemployee = new EmployeeNameComparator().thenComparing(new EmployeeAgeComparator());
        TreeSet<Employee> employeesComparator = new TreeSet<>(cemployee);
        employeesComparator.add(new Employee("A", 15));
        employeesComparator.add(new Employee("A", 12));
        employeesComparator.add(new Employee("BB", 11));
        employeesComparator.add(new Employee("DDDD", 9));
        employeesComparator.add(new Employee("TTTTT", 20));
        System.out.println("comparator: " + employeesComparator);
    }
}
