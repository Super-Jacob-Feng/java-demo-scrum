package com.demo.scrum.service;

import com.demo.scrum.domain.User;
import com.demo.scrum.repository.UserRepository;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Integer create(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        userRepository.save(user);

        return user.getId();
    }
}