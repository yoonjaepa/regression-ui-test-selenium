package com.ktds.uitest.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ktds.uitest.dao.UserDao;

@Component
public class AppRunner implements ApplicationRunner {
	
	private UserDao userDao;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
