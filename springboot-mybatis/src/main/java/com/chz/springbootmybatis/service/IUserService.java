package com.chz.springbootmybatis.service;

import com.chz.springbootmybatis.dto.User;

import java.util.List;

public interface IUserService {
    List<User> queryAll();
}
