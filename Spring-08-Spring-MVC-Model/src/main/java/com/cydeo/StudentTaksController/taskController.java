package com.cydeo.StudentTaksController;

import com.cydeo.model.Gender;
import com.cydeo.model.StudentTask;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class taskController {
    @RequestMapping("/StudentInfoTable")
    public String task(Model model){
        StudentTask task1= new StudentTask("Mickael","Smith",25, Gender.MALE);
        StudentTask task2= new StudentTask("Tom","Hanks",35, Gender.MALE);
        StudentTask task3= new StudentTask("Ammy","Bryan",33, Gender.FEMALE);

        model.addAttribute("row1",task1);
        model.addAttribute("row2",task2);
        model.addAttribute("row3",task3);

        return "/StudentTask/studentInfo";
    }
}
