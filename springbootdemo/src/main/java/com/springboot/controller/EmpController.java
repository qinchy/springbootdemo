package com.springboot.controller;

import com.springboot.model.Emp;
import com.springboot.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/2.
 */
@RestController
public class EmpController {
    private Logger log = LoggerFactory.getLogger(EmpController.class);

    @Autowired
    private EmpService empService;

    @RequestMapping(value="empInfo/{empNo}",method = RequestMethod.GET)
    public Emp getEmp(@PathVariable int empNo){
        log.info("welcome");
        Emp list = empService.getEmp(empNo);
        log.info("bye");
        return list;
    }
}
