package com.example.spring_security.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @GetMapping("hello")
    public String greet(){
        return "Hello";
    }

}
