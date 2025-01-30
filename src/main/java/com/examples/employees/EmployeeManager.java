import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        // Hardcoded Employee Data
        employees.add(new Employee("E001", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.add(new Employee("E002", "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        employees.add(new Employee("E003", "Alice", "Brown", "alice.brown@example.com", "HR Manager"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
