package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigCar.class);
        Car car = context.getBean(Car.class);
        Person person= context.getBean(Person.class);

        System.out.println("car make is : "+car.getMake());
        System.out.println("person name is : "+person.getName());
        System.out.println("person car is : "+person.getCar().getMake());
    }


}
