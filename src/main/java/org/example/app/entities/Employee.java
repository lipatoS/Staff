package org.example.app.entities;

public class Employee {

    private final String name;
    private final String position;
    private final String phone;
    private final Double salary;

    public Employee(String name, String position, String phone, Double salary) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public String getPosition() {

        return position;
    }

    public String getPhone() {

        return phone;
    }

    public Double getSalary() {
        return salary;
    }
}
