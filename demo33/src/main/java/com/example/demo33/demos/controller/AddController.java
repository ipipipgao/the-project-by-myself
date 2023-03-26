package com.example.demo33.demos.controller;

import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AddController {

    @Autowired
    public AddService addService;
    @Autowired
    public UserMapper userMapper;

    @PostMapping("/add/user")
    public Map<String,String> add(@RequestParam Map<String,String> data) {
        System.out.println("usercontroller");
        return addService.add(data);
    }


}
