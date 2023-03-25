package com.example.demo33.demos.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface AddService {

    Map<String,String> add(Map<String,String> data);
}
