package com.chz.controller;

import com.chz.dao.UserRepo;
import com.chz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int i) {
        //结果有可能为空用Optional封装
        Optional<User> user = userRepo.findById(i);
        return user.get();
    }
//    http://localhost:8080/user?name=ll&age=20&gender=2
    @GetMapping("/user")
    public User addUser(User user) {
        User save = userRepo.save(user);
        return save;
    }
}
