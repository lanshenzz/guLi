package com.learn.mpdemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learn.mpdemo1.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    
}