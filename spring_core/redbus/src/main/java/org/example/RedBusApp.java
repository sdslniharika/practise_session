package org.example;

import org.example.frontend.RedBus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RedBusApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        RedBus frontEnd=context.getBean(RedBus.class);
        frontEnd.run();

    }
}
