package com.alexander.komegunov.different.compar;

/**
 * Для того, чтобы объекты Employee можно было сравнить и сортировать, они должны применять интерфейс Comparable<E>.
 * При применении интерфейса он типизируется текущим классом.
 */

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int age;
    private final PositionsEmployees position;

    public Employee(String name, int age, PositionsEmployees position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PositionsEmployees getPosition() {
        return position;
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
                ", position=" + position +
                '}';
    }
}