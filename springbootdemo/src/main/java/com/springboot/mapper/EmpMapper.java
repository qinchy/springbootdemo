package com.springboot.mapper;

import com.springboot.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Mapper
public interface EmpMapper {
    public Emp getEmp(int empNo);
}
