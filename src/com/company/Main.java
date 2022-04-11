package com.company;

public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {

    }
    public static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double result = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                result += employee.getSalary();
            }
        }
        return result;
    }

    public static Employee findEmployeeMinSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                result = employee;
            }
        }
        return result;
    }

    public static double calculateAvgSalary() {
        int quantity = 0;
        for (Employee employee : employees) {
            quantity++;
        }
        return calculateTotalSalary() / quantity;
    }
    // мм
    public static void printFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
            }
        }
    }
}

