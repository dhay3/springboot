package com.chz.dao;

import com.chz.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //如果通过注解形式不需要在yml中配置mapper-location
    @Select("select * from tbl_teacher")
    List<Teacher> queryAll();
}
