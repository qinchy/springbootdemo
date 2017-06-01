package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/1.
 */
@Controller
@RequestMapping(value="/freemarker")
public class FreemarkerController {
    @Value("${application.message:1234556677}")
    private String message = "hi,hello world......";

    @RequestMapping("/demo")
    public String demo(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message",this.message);
        return "hello";//返回的内容就是templetes下面文件的名称
    }

}
