package com.greenfoxacademy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zsofiaprincz on 19/12/16.
 */

@Controller
public class HelloWebController {

    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) { //web/greeting/?name=valami
        long num = counter.incrementAndGet();
        model.addAttribute("name", name);
        model.addAttribute("num", num);
        return "greeting";
    }

}
