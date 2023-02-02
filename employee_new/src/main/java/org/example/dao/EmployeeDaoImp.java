package org.example.dao;

import org.example.datastorage.EmployeeDetails;
import org.example.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImp implements  EmployeeDao{

    public void addEmployee(Employee employee)
    {
        EmployeeDetails.employeeMap.put(employee.getEmployeeId(),employee);

    }

    public  Optional<Employee> getEmployee(int empId)
    {
        Employee employee= EmployeeDetails.employeeMap.get(empId);
        if(employee==null)
        {
            return Optional.empty();
        }
        return Optional.of(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        Collection<Employee> employeeCollection=EmployeeDetails.employeeMap.values();
        List<Employee> employeeList=new ArrayList<>();
        employeeList.addAll(employeeCollection);
        return employeeList;

    }


}
