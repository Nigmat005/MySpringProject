package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentTask {
    private String firstName;
    private String lastName;
    private int Age;
    private Gender gender;
}
