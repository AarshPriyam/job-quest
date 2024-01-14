package com.jobquest.application.controller;

import com.jobquest.application.entity.User;
import com.jobquest.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/home/")
public class UserController {
    @Autowired
    public UserService userservice;

    @GetMapping("view")
    public List<User> getUsers() {
        return userservice.getUsers();
    }

    @PostMapping("signup")
    public void signUp(@RequestBody User user) {
        userservice.signUp(user);
    }
}
