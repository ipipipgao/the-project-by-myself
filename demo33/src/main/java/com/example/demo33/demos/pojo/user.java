package com.example.demo33.demos.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
}
