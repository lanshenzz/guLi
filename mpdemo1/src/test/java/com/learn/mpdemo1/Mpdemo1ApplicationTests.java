package com.learn.mpdemo1;

import com.learn.mpdemo1.entity.User;
import com.learn.mpdemo1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class Mpdemo1ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList() {
        System.out.println(("----- selectAll method test ------"));
        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        //所以不填写就是无任何条件
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    public void addUser(){
        User user=new User();
        user.setName("json");
        user.setAge(33);
        user.setEmail("json@qq.com");
        int insert=userMapper.insert(user);
        System.out.println("insert:"+insert);
    }

    @Test
    public void undateUser(){
        User user=new User();
        user.setId(2L);
        user.setAge(110);
        int row=userMapper.updateById(user);
        System.out.println(row);
    }

    @Test
    public void testOptimisticLockerInterceptor(){
       User user=userMapper.selectById(1246415527014207490L);
       user.setAge(200);
       userMapper.updateById(user);
    }

    @Test
    public void testSelectDemo1(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        System.out.println(users);
    }

    @Test
    public void contextLoads() {
    }

}
