package com.springboot.demo.controller;

import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/getUser")
    public Object getUserById(long id){
        return userService.getUserByIdService(id);
    }


    @RequestMapping("/getUserByName")
    public Object getUserByName(String name){
        return userService.getUserByName(name);
    }
}
