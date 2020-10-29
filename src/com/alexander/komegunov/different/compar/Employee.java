package com.alexander.komegunov.different.compar;

/**
 * Для того, чтобы объекты Employee можно было сравнить и сортировать, они должны применять интерфейс Comparable<E>.
 * При применении интерфейса он типизируется текущим классом.
 */

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee employee) {
        return name.length() - employee.getName().length();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
