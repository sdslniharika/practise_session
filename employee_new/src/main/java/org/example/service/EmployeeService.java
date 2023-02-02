package org.example.service;

import org.example.entity.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EmployeeService {
    public void addEmployee(int employeeId, String employeeName, double salary,
                            LocalDate dateOfBirth, LocalDate dateOfJoining, String hno, String street, String city);
    public Employee fetchEmployee(int empId);

    public List<Employee> getAllEmployees();
}
