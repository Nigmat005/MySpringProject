package com.cydeo.controller;

import com.cydeo.model.Gender;
import com.cydeo.model.StudentTask;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class anotherController {
        @RequestMapping("/StudentInfoTable")
        public String task(Model model){
            List<StudentTask> list=new ArrayList<>();
            StudentTask task1= new StudentTask("Mickael","Smith",30, Gender.MALE);
            StudentTask task2= new StudentTask("Tom","Hanks",35, Gender.MALE);
            StudentTask task3= new StudentTask("Ammy","Bryan",33, Gender.FEMALE);

            list.addAll(Arrays.asList(task1,task2,task3));


            model.addAttribute("StudentList",list);

            return "/StudentTask/studentInfo";
        }
    }
