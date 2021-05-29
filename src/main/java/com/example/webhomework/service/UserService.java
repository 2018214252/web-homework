package com.example.webhomework.service;

import com.example.webhomework.entity.User;
import com.example.webhomework.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordEncoder encoder;

    public User getUser(String userName){
        return userMapper.getUser(userName);
    }

    public void insertUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        userMapper.insert(user);
    }

    public void updatePassword(long uid, String password){
        userMapper.updateById(User.builder().id(uid).password(encoder.encode(password)).build());
    }
}
