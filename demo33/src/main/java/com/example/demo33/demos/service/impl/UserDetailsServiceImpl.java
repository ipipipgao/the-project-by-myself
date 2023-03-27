package com.example.demo33.demos.service.impl;
//这个类结成的接口就是来源于spring——securi这个依赖，依赖相当于代码库，这个接口是管理

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo33.demos.mapper.UserMapper;
import com.example.demo33.demos.pojo.User;
import com.example.demo33.demos.service.impl.util.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public UserMapper userMapper;


    //试试最上面的username能不能改
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //s默认为输入行的第一个输入行
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        User user = userMapper.selectOne(queryWrapper);
        if(user == null) {
            throw new RuntimeException("用户不存在");
        }

        return new UserDetailsImpl(user);
    }
}
