package com.example.baithigiuaki;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    Employee getEmployeeById(int id);
    List<Employee> searchEmployees(String keyword);
}
