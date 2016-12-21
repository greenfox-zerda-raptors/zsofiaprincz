package com.greenfoxacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Getter
@Setter
@Controller
public class Todo {

    int id;
    String title;
    boolean urgent;
    boolean done;

    public Todo(int id, String title) {
        this(id, title, false, false);
    }





}
