package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";
    public final AtomicLong counter = new AtomicLong();

    @RequestMapping("/namelist")
    public StudentList namelist(@RequestParam(value="name", defaultValue="glade to meet you!") String name) {
        return new StudentList(counter.incrementAndGet(),
                            String.format(template, name));
    }
}