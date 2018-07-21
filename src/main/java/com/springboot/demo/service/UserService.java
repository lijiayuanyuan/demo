package com.springboot.demo.service;

import com.springboot.demo.domain.User;

import java.util.List;

public interface UserService {

    User getUserByIdService(Long id);

    List<User> getUserByName(String name);

    List<User> getAllUsers();

}
