package com.example.baithigiuaki;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.set(i, employee);
                break;
            }
        }
    }

    @Override
    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> searchEmployees(String keyword) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getHoTen().toLowerCase().contains(keyword.toLowerCase()) ||
                    String.valueOf(employee.getId()).contains(keyword)) {
                result.add(employee);
            }
        }
        return result;
    }
}

