package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    @Value("${word}")
    private String word;

    @GetMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println("是我");
        return name+","+this.word;
    }
}
