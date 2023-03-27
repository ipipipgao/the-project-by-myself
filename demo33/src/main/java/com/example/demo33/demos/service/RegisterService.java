package com.example.demo33.demos.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface RegisterService {

    //参数用驼峰命名法
    Map<String,String> regitster(String username, String password, String confirmedpassword);
}
