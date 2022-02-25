package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class dealerApp {
    public static void main(String[] args) {


        ApplicationContext container =new AnnotationConfigApplicationContext(ConfigApp.class);

        Person person=container.getBean(Person.class);
        Car car=container.getBean(Car.class);
        person.setName("Michael");
        System.out.println("Person's name is: "+person.getName());
        System.out.println("=================================");
        car.setMake("Toyota");
        System.out.println("The make of Car is: "+car.getMake());

        System.out.println("=================================");
//        person.setCar(car);
//        System.out.println("The person's car is: "+person.getCar().getMake());

        System.out.println("=============================================");
        person.myCar();
    }
}
