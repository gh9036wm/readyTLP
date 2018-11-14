package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.LoginService;


@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	LoginService service;
	
	@RequestMapping(value ="/", method= RequestMethod.GET)
	public String showLoginPage( ModelMap model) {
		model.put("name", "in28Minutes");
	return "welcome";
	}
	
	@RequestMapping(value ="/login", method= RequestMethod.POST)
	public String showWelcomePage( ModelMap model,@RequestParam String name, @RequestParam String password) {
	boolean isValidUser =	service.validateLogin(name, password);
	if (isValidUser==false) { // another way (!isValidUser)
		model.put("errorMessage", "Invalid Credential");
		return "login";
	}else {
		model.put("name", name);
		model.put("password", password );
	return "welcome";
	}
	}
	}



