package com.cydeo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
public class Person {
    private String name;
    private Car car;

}
