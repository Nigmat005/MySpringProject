package com.cydeo.Stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigCourse.class);
        Java java=context.getBean(Java.class);
        java.getTeachingHours();

        context.getBean(Selenium.class).getTeachingHours();
        context.getBean(Agile.class).getTeachingHours();

    }
}
