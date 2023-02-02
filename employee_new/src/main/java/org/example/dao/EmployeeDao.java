package org.example.dao;

import org.example.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    public void addEmployee(Employee employee);
    public Optional<Employee> getEmployee(int empId);

    public List<Employee> getAllEmployees();

}
