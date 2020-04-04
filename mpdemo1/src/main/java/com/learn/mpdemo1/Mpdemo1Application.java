package com.learn.mpdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.learn.mpdemo1.mapper")
public class Mpdemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mpdemo1Application.class, args);
    }

}
