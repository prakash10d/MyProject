package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.User;
import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserService;

@SpringBootTest
class MockitoTestApplicationTests {

	@MockBean
	private UserService userservice;


	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void createUser() {
		User user = new User(1, "prakash", "raja");
		Mockito.when(userservice.createuser(ArgumentMatchers.any(User.class))).thenReturn(user);
		User excepected = userservice.createuser(user); 
		System.out.println(excepected);
		assertEquals(excepected, user);
	}
	@Test
	public void getUser() {
		List<User> users = new ArrayList<User>();
		users.add(new User (1,"Sakthi Gv","sakthi"));
		Mockito.when(userservice.listAllUsers()).thenReturn(users);
		List<User> expected = userservice.listAllUsers();
		System.out.println(expected);
		assertEquals(expected, users);
		}
	@Test
	  public void getByUserId() {
		int userId =1;
	   UserDetails userdetail =new  UserDetails(1,"PRAKASH","raja");
		Mockito.when(userservice.getByUserId(userId)).thenReturn(userdetail);
		UserDetails excepted = userservice.getByUserId(userId);
		System.out.println(excepted);
		assertEquals(excepted, userdetail);
		
		

	}

	
}
