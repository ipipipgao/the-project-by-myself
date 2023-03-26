package com.example.demo33.demos.controller;

import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.pojo.User;
import com.example.demo33.demos.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AddController {

    @Autowired
    public AddService addService;
    @Autowired
    public UserMapper userMapper;

    @GetMapping("/add/user/{username}/{password}/")
    public Map<String,String> add(@PathVariable String username,@PathVariable String password) {
        Map<String,String> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        return addService.add(map);
    }

    @GetMapping("/user/all")
    public List<User> userList() {
        return userMapper.selectList(null);
    }


}
