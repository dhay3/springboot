package com.chz.springbootmybatis.dao;

import com.chz.springbootmybatis.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是操作数据库的mapper,如果使用@Mapper不需要配置@ComponentScan
//@Repository//如果是@Repostitory需要配置@ComponentScan
public interface UserMapper {
    List<User> queryAll();
}
