package com.example.demo33.demos.controller;

import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.pojo.user;
import com.example.demo33.demos.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AddController {

    @Autowired
    public AddService addService;
    @Autowired
    public UserMapper userMapper;

//    post就可以把从前端前来的数据不用放在url上了，直接放在@RequestParam的参数上面
    @PostMapping("/add/user")
    public Map<String,String> add(@RequestParam Map<String,String> data) {
        System.out.println("usercontroller");
        return addService.add(data);
    }

    @GetMapping("/test")
    public List<user> test() {
        return userMapper.selectList(null);
    }

    @GetMapping("/tmptest")
    public String tmptest() {
        return "error_message=success";
    }

}
