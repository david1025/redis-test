package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setId("1231231");
        student.setCreateDate(new Date());
        student.setNum(2.2d);
        redisTemplate.opsForValue().set(student, student);
//        User user = new User();
//        user.setId(1);
//        user.setName("123");
//        redisTemplate.opsForValue().set(user, user);
//        System.out.println(redisTemplate.opsForValue().get(user));
//
//        user = new User();
//        user.setId(2);
//        user.setName("David");
//
//        redisTemplate.opsForValue().set(user, user);
//        System.out.println(redisTemplate.opsForValue().get(user));
    }

}
