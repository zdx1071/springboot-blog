package com.zdx.service;

import com.zdx.dao.UserRepository;
import com.zdx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name){
        User user = null;
        try {
            user = userRepository.findByUserName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
