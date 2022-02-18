package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(configApp.class,configAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class); // tf here is bean
        ft.createFulltimeMentor();

        System.out.println("========================================================");

        FullTimeMentor ft2=container.getBean("full2",FullTimeMentor.class);
         ft2.createFulltimeMentor();

//        String str=container.getBean(String.class);
//        System.out.println(str);

    }
}
