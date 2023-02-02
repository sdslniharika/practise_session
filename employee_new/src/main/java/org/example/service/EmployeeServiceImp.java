package org.example.service;

import org.example.dao.EmployeeDao;
import org.example.entity.Address;
import org.example.entity.Employee;
import org.example.exception.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements  EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    public void addEmployee(int employeeId, String employeeName, double salary,
                            LocalDate dateOfBirth, LocalDate dateOfJoining, String hno, String street, String city)
    {
        Address address=new Address(hno,street,city);
        Employee employee=new Employee(employeeId,employeeName,salary,dateOfBirth,dateOfJoining,address);
        employeeDao.addEmployee(employee);
    }

    @Override
    public Employee fetchEmployee(int empId) {
        Optional<Employee> employeeOptional=employeeDao.getEmployee(empId);
        if(employeeOptional.isEmpty())
        {
            throw new EmployeeNotFound("Employee not found");
        }
        return employeeOptional.get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }


}
