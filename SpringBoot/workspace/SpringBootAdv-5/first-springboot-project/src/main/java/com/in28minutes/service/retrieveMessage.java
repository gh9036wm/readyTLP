package com.in28minutes.service;

import org.springframework.stereotype.Component;

@Component
 public class retrieveMessage {
	public String welcomeMessage() {
		return ("This is bussiness logic 2: Using Annotation @Service or @Component so controller can call it "
				+ "without using 'new retriveMessage' each time is called" );
	}
	
}