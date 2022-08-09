package com.testify.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.testify.domain.UserData;
import com.testify.service.UserService;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/users")
public class UserAPI {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/loginpage")
	public boolean login(@RequestBody UserData user) {
		return userService.login(user);
	}

	@RequestMapping
	public List<UserData> getAllUsers() {
		return userService.getAllUserService();
	}
	
	@PostMapping
	public void addNewUser(@RequestBody UserData c) {
	
		userService.addUserService(c);
		
	}
	
}
