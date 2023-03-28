package com.example.demo33.demos.controller;

import com.example.demo33.demos.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class RegisterController {

    @Autowired
    public RegisterService registerService;

    @PostMapping("/user/account/register")
    public Map<String,String> register(@RequestParam Map<String,String> data) {
        String username = data.get("username");
        String password = data.get("password");
        String confirmedPassword = data.get("confirmedPassword");

        System.out.println(username+"==="+password+"====="+confirmedPassword);
        System.out.println("registerController");
        return registerService.register(username,password,confirmedPassword);
    }
}
