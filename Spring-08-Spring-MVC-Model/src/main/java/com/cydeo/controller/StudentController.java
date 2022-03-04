package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
       // model method
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        Long studentId= new Random().nextLong();
        model.addAttribute("id",studentId);

        List<Integer> myList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        model.addAttribute("List",myList);

        Student student =new Student(1,"Mike","Smith");
        model.addAttribute("studentInfo",student);
        return "/student/welcome";
    }
}
