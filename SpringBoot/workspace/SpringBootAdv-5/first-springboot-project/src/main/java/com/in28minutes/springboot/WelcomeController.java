package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.service.retrieveMessage;

@RestController
public class WelcomeController {
	@Autowired
	retrieveMessage service ;
	@RequestMapping("/welcome")
	public String welcome() {
		return service.welcomeMessage();
	}

}

