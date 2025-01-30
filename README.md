Employee Management REST API
Job Simulation - Java Spring Boot & GreenLake Cloud Platform
Overview

This project is a RESTful web service built using Java Spring Boot. It provides an API endpoint that allows users to retrieve a list of employees in JSON format. The service supports HTTP GET requests to fetch all employees.

This project is part of a job simulation task that involves designing and implementing a Spring Boot REST API that stores employee data on a private cloud server (GreenLake Cloud Platform).
Features

✔ Retrieve a full list of employees in JSON format
✔ Uses Spring Boot for easy deployment and maintainability
✔ Follows RESTful API best practices
✔ Hardcoded sample employee data (for now)
API Endpoint
Method	URL	Description
GET	/employees	Retrieves the full list of employees
Example Request

curl -X GET http://localhost:8080/employees

Example Response

{
    "employeeList": [
        {
            "employee_id": "E001",
            "first_name": "Alice",
            "last_name": "Johnson",
            "email": "alice.johnson@example.com",
            "title": "Software Engineer"
        },
        {
            "employee_id": "E002",
            "first_name": "Bob",
            "last_name": "Smith",
            "email": "bob.smith@example.com",
            "title": "Product Manager"
        },
        {
            "employee_id": "E003",
            "first_name": "Charlie",
            "last_name": "Brown",
            "email": "charlie.brown@example.com",
            "title": "Data Analyst"
        }
    ]
}

Project Structure

/employee-management
│── src/main/java/com/example/employees
│   ├── Employee.java          (Employee model)
│   ├── Employees.java         (List of employees)
│   ├── EmployeeManager.java   (Manages employee data)
│   ├── EmployeeController.java (Handles API requests)
│   ├── RestServiceApplication.java (Main entry point)
│── pom.xml                    (Maven dependencies)
│── README.md                  (Project documentation)
│── application.properties      (Configuration settings)

Installation & Running
1. Prerequisites

    Java 17+
    Maven
    Spring Boot 3.0+
    Postman or Curl (for API testing)

2. Clone the Repository

git clone https://github.com/yourusername/employee-management.git
cd employee-management

3. Build the Project

mvn clean package

4. Run the Application

mvn spring-boot:run

5. Test the API

Open Postman or run:

curl -X GET http://localhost:8080/employees