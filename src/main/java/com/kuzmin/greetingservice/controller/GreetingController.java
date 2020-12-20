package com.kuzmin.greetingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("greetings")
    public String getGreetings(){
        return "Welcome to the App, my friend!";
    }
}
