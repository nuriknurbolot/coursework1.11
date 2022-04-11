package com.company;

public class Employee {
    private final String firstName;
    private final String lastName;
    private double salary;
    private int id;
    private int department;
    private static int nextID;

    public Employee(String firstName, String lastName, int department, double salary) {
        this.firstName =firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = ++nextID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", department=" + department +
                '}';
    }
}
