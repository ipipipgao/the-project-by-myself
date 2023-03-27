package com.example.demo33.demos.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface LoginService {

    Map<String,String> getToken(String username,String password);
}
