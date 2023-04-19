package com.javaBasics.CollectionsSession;

import java.util.Objects;

public class Employee {
    String name;
    int age;
    String dept;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dept);
    }

    public Employee(String name, int age, String dept) { // just class constructor
        this.name = name;
        this.age = age;
        this.dept = dept;


    }
}
