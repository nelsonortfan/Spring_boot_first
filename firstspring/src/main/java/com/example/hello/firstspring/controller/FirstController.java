package com.example.hello.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FirstController {

    @GetMapping("/firstProject")
    public String firstSpringBoot(){
        return "This is the first Spring Boot with Intellij Nelson";
    }


}
