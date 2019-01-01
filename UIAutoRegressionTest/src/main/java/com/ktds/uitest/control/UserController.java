package com.ktds.uitest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.uitest.dao.UserDao;
import com.ktds.uitest.domain.User;


@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	/**
	@RequestMapping("/add")
	public User add(User user) {
		User userData = userDao.save(user);
		
		return userData;
	}
	**/
	
	@RequestMapping("/users")
	public List<User> list(Model model) {
		List<User> userList = userDao.findAll();
		
		return userList;
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		User userData = userDao.save(user);
		
		return userData;
	}
	
	@PostMapping("/users")
	public List<User> getUser(@RequestBody List<User> users) {
		
		List<User> userList = userDao.saveAll(users);
		
		return userList;
		
	}
	
	
	
	
	
	
	
	

}
