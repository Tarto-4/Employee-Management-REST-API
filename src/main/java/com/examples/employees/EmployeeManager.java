package com.example.employees;

import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.setEmployeeList(Arrays.asList(
            new Employee("E001", "Alice", "Johnson", "alice.johnson@example.com", "Software Engineer"),
            new Employee("E002", "Bob", "Smith", "bob.smith@example.com", "Product Manager"),
            new Employee("E003", "Charlie", "Brown", "charlie.brown@example.com", "Data Analyst")
        ));
    }

    public Employees getEmployees() {
        return employees;
    }
}
