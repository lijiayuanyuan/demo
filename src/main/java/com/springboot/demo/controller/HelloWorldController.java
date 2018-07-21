package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.domain.User;

@RestController
public class HelloWorldController {


	/**
	 * 一般接口
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/getUser",method=RequestMethod.POST)
	public User getUser(String name) {
		User user = new User();
		user.setUserName(name);
		user.setPassword("123456");
		return user;
	}
	
	
}
