package com.example.demo33.demos.controller;

import com.example.demo33.demos.web.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NewController {

    @RequestMapping("/student")
    public User user() {
        Map<String,String> map = new HashMap<>();
        map.put("habit","sport and eating");
        User user = new User();
        user.setName("theonefx");
        user.setAge(666);
        user.setScore(99);
        return user;
    }
}
