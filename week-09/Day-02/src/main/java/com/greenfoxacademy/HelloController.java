package com.greenfoxacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Controller
public class HelloController {

    @RequestMapping(value = "/helloworld")
    public String helloworld (Model model, @RequestParam (defaultValue =  "Thymeleaf", required = false) String name){
        Date date = new Date();
        model.addAttribute("date", date);
        model.addAttribute("name", name);
        return "helloworld";
    }
}
