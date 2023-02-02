package practice;

import java.util.Objects;

public class Employee {

    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee customer = (Employee) o;
        return empId == customer.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}
