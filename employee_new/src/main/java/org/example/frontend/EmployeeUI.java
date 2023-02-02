package org.example.frontend;

import org.example.entity.Employee;
import org.example.exception.EmployeeNotFound;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class EmployeeUI {

    @Autowired
    EmployeeService employeeService;

    public void run()
    {
        {

            try {


                System.out.println("<<<<<<<<<<<<<<<<<<-------------------Employee Details ------------------->>>>>>>>>>>>>>>");

                Scanner sc = new Scanner(System.in);
                boolean flag = true;
                while (flag) {
                    System.out.println("Select an option :");
                    System.out.println(" 1. Enter Employee Details");
                    System.out.println("2. Print Employee Details ");
                    System.out.println("3. List all Employees");
                    System.out.println("4. Exit");

                    int n = sc.nextInt();
                    switch (n) {
                        case 1:
                            System.out.println("Enter Employee Id");
                            int empNo = sc.nextInt();

                            System.out.println("Enter employee name");
                            String empName = sc.next();

                            System.out.println("Enter Salary ");
                            double salary = sc.nextDouble();

                            System.out.println("Enter Date of birth yyyy-mm-dd");
                            String dob = sc.next();
                            LocalDate date = LocalDate.parse(dob);

                            System.out.println("Enter Date of joining yyyy-mm-dd");
                            String doj = sc.next();
                            LocalDate dateOfJoin = LocalDate.parse(doj);

                            System.out.println("Enter house number");
                            String hno = sc.next();

                            System.out.println("Enter street");
                            String street = sc.next();

                            System.out.println("Enter city");
                            String city = sc.next();

                            employeeService.addEmployee(empNo,empName,salary,date,dateOfJoin,hno,street,city);
                            break;
                        case 2:
                            System.out.println("Enter Employee Id");
                            int emp = sc.nextInt();
                            Employee employee=employeeService.fetchEmployee(emp);
                            System.out.println(employee);
                            break;
                        case 3:

                           List<Employee> employeeList= employeeService.getAllEmployees();
                           employeeList.stream().forEach(e->System.out.println(e));
                           break;
                        case 4:
                            flag = false;
                            break;
                    }
                }
            } catch (EmployeeNotFound e) {
                System.out.println(e.getMessage());
            }  catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
