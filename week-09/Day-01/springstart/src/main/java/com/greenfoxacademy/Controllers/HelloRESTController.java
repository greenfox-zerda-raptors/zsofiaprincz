package com.greenfoxacademy.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;



/**
 * Created by zsofiaprincz on 19/12/16.
 */
@RestController
public class HelloRESTController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping
    public Greeting greeting (@RequestParam(value="name") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello " + name);
    }
}
