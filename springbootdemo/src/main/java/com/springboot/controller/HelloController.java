package com.springboot.controller;

import com.springboot.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/27.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value="/hello")
public class HelloController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index() {
        String s = redisUtil.get("age","null");
        System.out.println("=================================="+s);
        return "Hello World";
    }
}
