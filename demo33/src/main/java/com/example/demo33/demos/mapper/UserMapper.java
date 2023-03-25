package com.example.demo33.demos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo33.demos.pojo.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<user> {
}
