package com.example.employees;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.addEmployee(new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.addEmployee(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Project Manager"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
