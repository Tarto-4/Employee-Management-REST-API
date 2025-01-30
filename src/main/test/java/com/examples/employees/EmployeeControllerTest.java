package com.example.employees;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

public class EmployeeControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetEmployees() {
        Employees employees = new Employees();
        employees.addEmployee(new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer"));

        when(employeeManager.getEmployees()).thenReturn(employees);

        Employees result = employeeController.getEmployees();

        assertEquals(1, result.getEmployeeList().size(), "Should return a list with one employee");
        assertEquals("John", result.getEmployeeList().get(0).getFirst_name(), "Employee first name should be John");
    }

    @Test
    void testAddEmployee() {
        Employee newEmployee = new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Project Manager");

        ResponseEntity<String> response = employeeController.addEmployee(newEmployee);

        verify(employeeManager, times(1)).addEmployee(newEmployee);
        assertEquals(HttpStatus.CREATED, response.getStatusCode(), "Response status should be 201 CREATED");
    }
}
