package com.example.demo33;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class Demo33ApplicationTests {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Test
    void contextLoads() {
        System.out.println("111111111111111111111222222222");
//        passwordEncoder.encode("pwzs");
//        $2a$10$6bJS8gaqA4Mp0hevBEQpP.saUwxRtxSraG71Z7ZUHrt4uUhFORq/W
//        $2a$10$ldB326fJbEP.LEbNcf7BDu6Myxlqax2OmDzyvftHQO0.H8oZQdc4q
        System.out.println(passwordEncoder.matches("pwzs","$2a$10$ldB326fJbEP.LEbNcf7BDu6Myxlqax2OmDzyvftHQO0.H8oZQdc4q"));
    }

}
