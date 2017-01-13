package com.caloriecounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("/")
    public String index (){
        return "redirect:/code";
    }


    @GetMapping(value = "/code")
    public String addMessageToCode(Model model) {
        model.addAttribute("message", new Message());
        return "code";
    }

    @PostMapping(value = "/code")
    public String postCodedMessage(@ModelAttribute Message message) {
        messageService.encrypting(message);
        messageService.saveCodedMessageToDB(message);
        return "codedmessage";
    }




}
