package com.in28minutes.spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.spring.web.service.loginService;

@Controller
@SessionAttributes("nameKey")
public class LoginController {
	@Autowired
	loginService loginservice;
	// method support get to show the page
	@RequestMapping(value ="/login", method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return  "login";
	}
	// method support Post to take post and create param for variable so we can call with RequestParam
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public String showWelcomeMessage(ModelMap model, @RequestParam String name,@RequestParam String password) {
		boolean isValidate = loginservice.loginValidate(name, password);
		
		if(isValidate) {
		model.put("nameKey", name);
		model.put("passwordKey", password);
		return  "welcome";
	}else {
		model.put("errorMessage","Invalid Credential");
		return "login";
	}
	}
	

}
