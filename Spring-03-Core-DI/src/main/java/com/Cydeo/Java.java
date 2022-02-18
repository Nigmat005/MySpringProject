package com.Cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Java {
   // field Injection
    @Autowired
    OfficeHours officeHours;

    // Constructor Injection
//     @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours is: "+(20+officeHours.getHours()));
    }
}
