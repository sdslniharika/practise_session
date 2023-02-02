package org.example;

import org.example.frontend.EmployeeUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunUI {
    public static void main(String args[])
    {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(App.class);
        EmployeeUI employeeUI=applicationContext.getBean(EmployeeUI.class);
        employeeUI.run();

        
    }
}
