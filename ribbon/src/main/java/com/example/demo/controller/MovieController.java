package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("show")
    public String show(){
        //调用review的服务
        String result = restTemplate.getForObject("http://user/home/hello?name=221", String.class);
        return result;
    }

}
