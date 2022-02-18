package com.Cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigApp.class);

        Java java1 =context.getBean(Java.class);
        java1.getTeachingHours();


    }
}
