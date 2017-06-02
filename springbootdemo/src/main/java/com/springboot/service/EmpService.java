package com.springboot.service;

import com.springboot.mapper.EmpMapper;
import com.springboot.model.Emp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Component
public class EmpService {
    private Logger log = LoggerFactory.getLogger(EmpService.class);

    @Autowired
    private EmpMapper empMapper;

    public List<Emp> getEmp(int empNo) {
        List<Emp> list = empMapper.getEmp(empNo);
        return list;
    }
}
