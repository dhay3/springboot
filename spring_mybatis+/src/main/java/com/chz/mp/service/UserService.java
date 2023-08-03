package com.chz.mp.service;

import com.chz.mp.dao.UserMapper;
import com.chz.mp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll(){
        return userMapper.selectList(null);
    }
}
