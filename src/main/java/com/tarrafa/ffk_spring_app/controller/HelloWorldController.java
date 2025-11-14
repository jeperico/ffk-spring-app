package com.tarrafa.ffk_spring_app.controller;

import com.tarrafa.ffk_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

//    public HelloWorldController(HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Tarrafa");
    }
}
