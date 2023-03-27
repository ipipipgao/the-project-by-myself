package com.example.demo33.demos.service.impl;

import com.example.demo33.demos.pojo.User;
import com.example.demo33.demos.service.LoginService;
import com.example.demo33.demos.service.impl.util.UserDetailsImpl;
import com.example.demo33.demos.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Map<String, String> getToken(String username,String password) {
        System.out.println("11111117777731111111111");
        System.out.println("22222222222222222");
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        User user = loginUser.getUser();
        String jwt_token = JwtUtil.createJWT(user.getId().toString());
        Map<String,String> map = new HashMap<>();
        map.put("error_message","success");
        map.put("token",jwt_token);
        map.put("userId",user.getId().toString());
        return map;
    }
}
