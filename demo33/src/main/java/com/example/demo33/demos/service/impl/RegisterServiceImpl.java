package com.example.demo33.demos.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.pojo.User;
import com.example.demo33.demos.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String username, String password, String confirmedPassword) {

        Map<String,String> map = new HashMap<>();

        //查询该用户名是否已经存在    queryWarpper记得后面带上user
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        User userBool = userMapper.selectOne(queryWrapper);
        System.out.println("registerServiceImpl");
        if(userBool != null) {
             map.put("error_message","该用户已存在");
             return map;
        }
//        检验输入密码和确认密码是否相等等信息
        if(!password.equals(confirmedPassword)) {
            map.put("error_message","请重新输入密码和确认密码");
            return map;
        }

        //如果都没有问题，就直接导入数据库
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        userMapper.insert(user);
        map.put("error_message","success");
        return map;
    }
}
