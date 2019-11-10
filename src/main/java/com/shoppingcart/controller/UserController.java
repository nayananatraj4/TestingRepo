package com.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.entities.User;
import com.shoppingcart.service.impl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userserviceImpl;
	
    @GetMapping("/getAllUsers")
	public List<User> getAllUserDetails() {
		List<User> userDetailsList;
		userDetailsList = userserviceImpl.getAllUserDetais();
		return userDetailsList;
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userserviceImpl.addUser(user);
		return "added";
	}
	
}
