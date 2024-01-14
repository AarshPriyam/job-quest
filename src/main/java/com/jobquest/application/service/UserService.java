package com.jobquest.application.service;

import com.jobquest.application.entity.User;
import com.jobquest.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void signUp(User user) {

        if(userRepository.existsByEmail(user.getEmail())) {
            System.out.println("User Email already exists");
        }

    }


}
