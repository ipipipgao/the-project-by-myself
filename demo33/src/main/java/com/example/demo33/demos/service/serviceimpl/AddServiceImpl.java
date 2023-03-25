package com.example.demo33.demos.service.serviceimpl;

import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.pojo.user;
import com.example.demo33.demos.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AddServiceImpl implements AddService {

    @Autowired
    public UserMapper userMapper;
    //Override是重写方法
    @Override
    public Map<String, String> add(Map<String, String> data) {
        user user = new user();
        user.setUsername(data.get("name"));
        user.setPassword(data.get("password"));
        userMapper.insert(user);

        Map<String,String> map = new HashMap<>();
        map.put("error_message","success");
        System.out.println("addserviceimpl");

        return map;
    }
}
