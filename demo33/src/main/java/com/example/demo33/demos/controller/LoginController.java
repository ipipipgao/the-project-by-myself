package com.example.demo33.demos.controller;

import com.example.demo33.demos.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    public LoginService loginService;

    //由于这个是post请求，而游览器只能访问get请求，所以不能从游览器调试，只能从vs code调试
    @PostMapping("/user/account/token")
    public Map<String,String> getToken(@RequestParam Map<String,String> data) {
        String username = data.get("username");
        String password = data.get("password");
//        System.out.println(username+"======="+password);
        //调用这个login这个接口之前，必须先在前面Autowired注入一下
        return loginService.getToken(username,password);
    }



}
