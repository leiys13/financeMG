package com.sadasen.finance.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.finance.user.entity.User;
import com.sadasen.finance.user.service.UserService;

/**
 * @date 2018年1月16日
 * @author lei.ys
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/add")
	public User add(User user) {
		return userService.add(user);
	}
	
	@GetMapping("/get/{id}")
	public User get(@PathVariable("id") long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/delete/{id}")
	public User deleteById(@PathVariable("id") long id) {
		return userService.deleteById(id);
	}
	
}
