package com.web.springboot.demo.services;


import com.web.springboot.demo.entites.User;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    public User createUser (User user){
        User savedUser = new User(
                user.getId(),
        new Date(),
        new Date(),
        user.getName(),
        user.getSurname(),
        user.getUsername()
    );
        return savedUser;

    }
}

