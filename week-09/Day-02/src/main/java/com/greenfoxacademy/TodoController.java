package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

     TodoService todos;


    public TodoController(){
        todos = new TodoService();
    }

    @RequestMapping(value = {"/", "/list"})
   public String list(Model model) {
         model.addAttribute("todos", todos.getTodos());
            return "list";
          }
}
