package com.chz.springbootmybatis.service.impl;

import com.chz.springbootmybatis.dao.UserMapper;
import com.chz.springbootmybatis.dto.User;
import com.chz.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;//@Mapper报错

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
