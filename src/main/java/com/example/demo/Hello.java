package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Hello {

    ArrayList<String> list = new ArrayList<>();

    @GetMapping("/hello")
    public String GetHello()
    {
        String text = "";
        for (int i = 0; i < list.size(); i++) {
            text = text + list.get(i);
        }
        return text;
    }

    @PostMapping("/hello")
    public String PostHello(@RequestBody String variable)
    {
        list.add(variable);
        return  variable;
    }
}
