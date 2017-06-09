package com.xjtushilei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shilei
 * @Date 2017/6/9.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String heelo(){
        return "123";
    }

    @RequestMapping("/users")
    public String getUsers() {
        return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
                "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
    }
}
