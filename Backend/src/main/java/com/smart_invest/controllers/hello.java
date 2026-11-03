package com.smart_invest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/hello")
    public String Sayhello() {
        return "Hello, World!";
    }
}