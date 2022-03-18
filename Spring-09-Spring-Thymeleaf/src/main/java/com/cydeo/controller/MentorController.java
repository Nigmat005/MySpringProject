package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("mentor",new Mentor());

        List<String> batchList=new ArrayList<>(Arrays.asList("Batch18","Batch19","Batch20","Batch21","Batch22"));
        model.addAttribute("batch_List",batchList);

        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String confirm(@ModelAttribute("mentor") Mentor mentor2,Model model){
        System.out.println(mentor2.toString());
//        model.addAttribute("newMentorObj",mentor2);
        return "mentor/mentor-confirmation";
//        return "redirect:/mentor/register";
    }


}
