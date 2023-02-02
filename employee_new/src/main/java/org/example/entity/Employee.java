package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    @Autowired
    private Address address;

    public Employee()
    {

    }

    public Employee(int employeeId, String employeeName, double salary, LocalDate dateOfBirth, LocalDate dateOfJoining, Address address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee Details {" +
                "employeeId = " + employeeId +
                ", employeeName = '" + employeeName + '\'' +
                ", salary = " + salary +
                ", dateOfBirth = " + dateOfBirth +
                ", dateOfJoining = " + dateOfJoining +
                ", address = " + address +
                '}';
    }
}
