package com.autowired;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@AllArgsConstructor
public class Person {
    private String name;

   // @Autowired
    private Car car;

    @Autowired
    public Person(Car car){
        this.car=car;
    }


    public void myCar(){
        System.out.println("MyCar 's make is: "+car.getMake());
    }
}
