package com.company;

public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Popov","Andrey" , 1, 50000);
        employees[1] = new Employee("Ivanov", "Ivan", 2, 70000);
        employees[2] = new Employee("Drozdova", "Victoria", 3, 55000);
        System.out.println(printEmployees());
        // задание 2
        System.out.println(calculateTotalSalary());
        // задание 3
        System.out.println(findEmployeeMinSalary());
        // задание 4
        System.out.println(calculateAvgSalary());
        // задание 5
        System.out.println(findEmployeeMaxSalary());
    }
    public static String printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        return null;
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
                if (result == null || employee.getSalary() < result.getSalary()){
                    result = employee;
                }
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary() {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (result == null || employee.getSalary() > result.getSalary()) {
                    result = employee;
                }
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

