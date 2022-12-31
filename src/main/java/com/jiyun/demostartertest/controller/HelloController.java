package com.jiyun.demostartertest.controller;

import com.jiyun.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/h11")
    public String h1(HttpServletResponse response){
        String say = helloService.say();
        return say;
    }
}
