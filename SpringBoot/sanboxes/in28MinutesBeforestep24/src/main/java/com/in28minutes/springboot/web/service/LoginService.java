package com.in28minutes.springboot.web.service;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class LoginService {
   public boolean validateLogin(String userId, String pass) {
	   // SET userId = JamesT, pass= dummy === if the userId and pass passing into parameter is the same return true
	   // otherwise return false
	   return(userId.equalsIgnoreCase("in28Minutes") && pass.equalsIgnoreCase("dummy"));
			   
   }
}

