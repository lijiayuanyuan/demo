package com.springboot.demo.controller;

import com.springboot.demo.domain.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    UserService userService;

    /**
     * 反页面
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String hello(String name,Model model){
        List<User> userList = userService.getAllUsers();
        model.addAttribute("name",name);
        model.addAttribute("users",userList);

        return "hello";
    }

}
