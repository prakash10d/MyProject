package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserDetailRepository;
import com.example.demo.repository.Userrepository;

@Service
public class UserService {
	@Autowired
	Userrepository repository;
	
	@Autowired
	UserDetailRepository userdetail;
	
	public User createuser(User user)
	{
		return repository.save(user);
		
	}
	
	public List<User> listAllUsers()
		{
		return repository.findAll();
	}
	
	public UserDetails getByUserId(Integer UserId) {
		return userdetail.findById(UserId).get();
		
	}
	
}
