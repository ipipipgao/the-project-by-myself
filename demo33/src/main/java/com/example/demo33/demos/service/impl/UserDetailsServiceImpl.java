package com.example.demo33.demos.service.impl;

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
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        User user = userMapper.selectOne(queryWrapper);
        if(user == null) {
            //抛一个异常,忘了咋写了，这个Runtime异常应该是给你爆一个超时的异常卡住你
            throw new RuntimeException("用超时卡住你");
        }


        return new UserDetailsImpl(user);
    }
}
