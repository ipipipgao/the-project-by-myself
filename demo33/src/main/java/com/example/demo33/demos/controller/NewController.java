package com.example.demo33.demos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NewController {

    @RequestMapping("/student")
    public Map<String,String> user() {
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","2900");
        return map;
    }
}
