package com.in28minutes.spring.web.service;

import org.springframework.stereotype.Component;

@Component
public class loginService {
	
	public boolean loginValidate(String userId, String userPass) {
		return (userId.equalsIgnoreCase("in28Minutes") && userPass.equalsIgnoreCase("dummy")); 
	}		
}