package com.example.demo33.demos.service.impl;

import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.pojo.User;
import com.example.demo33.demos.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AddServiceImpl implements AddService {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public PasswordEncoder passwordEncoder;
    //Override是重写方法
    @Override
    public Map<String, String> add(Map<String, String> data) {
        User user = new User();

        user.setUsername(data.get("username"));
//        user.setPassword(data.get("password"));
        user.setPassword(passwordEncoder.encode(data.get("password")));
        userMapper.insert(user);

        Map<String,String> map = new HashMap<>();
        map.put("error_message","success");
        System.out.println("addserviceimpl");

        return map;
    }
}
