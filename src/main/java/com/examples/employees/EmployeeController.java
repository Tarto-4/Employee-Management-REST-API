package com.example.employees;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // GET request to fetch all employees
    @GetMapping
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }

    // POST request to add a new employee
    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return new ResponseEntity<>("Employee added successfully!", HttpStatus.CREATED);
    }
}
