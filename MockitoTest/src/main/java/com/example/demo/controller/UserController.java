package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserService;

@RestController
public class UserController {
     @Autowired
     UserService userservice;
     
     @PostMapping("/post/user")
     public User createUser(@RequestBody User user) {
		return userservice.createuser(user);
    	 
     }
  @GetMapping("get/users")
   public List<User> listAllUsers(){
	  return userservice.listAllUsers();
    	 
     }
     @GetMapping("get/{userId}")
     public UserDetails getByUserId(@PathVariable Integer userId) {
		return userservice.getByUserId(userId);
    	 
     }
}
