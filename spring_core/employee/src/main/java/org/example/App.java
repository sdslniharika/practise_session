package org.example;

import org.example.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("config.xml");
        Employee employee=(Employee)applicationContext.getBean("employee");

        System.out.println( "Employee details are = "+employee );

    }
}
