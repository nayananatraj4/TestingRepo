package com.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingcart.entities.User;

@Service
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{

}
