package com.example.employees;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTest {
    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    void testGetEmployeesInitially() {
        assertEquals(2, employeeManager.getEmployees().getEmployeeList().size(),
                "Initial employee list should contain 2 employees");
    }

    @Test
    void testAddEmployee() {
        Employee newEmployee = new Employee("3", "Alice", "Johnson", "alice@example.com", "Data Analyst");
        employeeManager.addEmployee(newEmployee);

        assertEquals(3, employeeManager.getEmployees().getEmployeeList().size(),
                "Employee list should contain 3 employees after adding one");
        assertTrue(employeeManager.getEmployees().getEmployeeList().contains(newEmployee),
                "New employee should be in the list");
    }
}
