package com.shoppingcart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.entities.User;
import com.shoppingcart.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUserDetais() {
		List<User> userDetailsList;
		userDetailsList = userRepository.findAll();
		System.out.println(userDetailsList);
			return userDetailsList;
	}

	public void addUser(User user) {
		userRepository.save(user);
	}

}
