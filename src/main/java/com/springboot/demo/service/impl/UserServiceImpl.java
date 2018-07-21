package com.springboot.demo.service.impl;

import com.springboot.demo.domain.User;
import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByIdService(Long id) {
        User user = userMapper.getUserById(id);
        user.setPassword("*******");
        return user;
    }

    @Override
    public List<User> getUserByName(String name) {
        name = "%"+name+"%";
        return userMapper.getUserByName(name);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAll();
    }


}
