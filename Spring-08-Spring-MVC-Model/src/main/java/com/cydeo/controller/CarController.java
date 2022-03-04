package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/info")         //localhost:8080/car/info?make=Honda
    public String carInfo(@RequestParam String make, Model model) {
        System.out.println(make);
        model.addAttribute("carMake", make);
        return "/car/car-info";

    }

    @RequestMapping("/info2")         //localhost:8080/car/info2?make=Honda&time=2022
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Tesla") String make, @RequestParam(value = "time", required = false, defaultValue = "2000") String time, Model model) {
        System.out.println(make);
        System.out.println(time);
        model.addAttribute("carMake", make);
        model.addAttribute("producedTime", time);
        return "/car/car-info";
    }

    @RequestMapping("/info2/{make}/{time}")         //localhost:8080/car/info2/Honda/2023
    public String getCarInfo(@PathVariable String make, @PathVariable(value="time",required = false) Integer time, Model model) {
        System.out.println(make);
        System.out.println(time);
        model.addAttribute("carMake", make);
        model.addAttribute("producedTime", time);
        return "/car/car-info";

    }
}
