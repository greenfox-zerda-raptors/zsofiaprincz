package com.greenfox.zsofi.reddit.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String index(Model model){

        return "Hello World";
    }
}
