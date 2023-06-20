package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ashokit.service.GreetServiceClient;

@RestController
public class WelcomeController {
	
	// for Feign client
	@Autowired
	private GreetServiceClient greetClient;
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		
		
//		//using RestTemplate
//		String welResponse = "Welcome To ashok It..!!...";
//		String greetUrl="http://localhost:2222/greet";
//		
//		RestTemplate rt=new RestTemplate();
//		ResponseEntity<String> forEntity = rt.getForEntity(greetUrl, String.class);
//		
//		String greetResponse = forEntity.getBody();
		
		
		//*********Feign client
		String welResponse = "Welcome To ashok It..!!...";
		
		String greetResponse = greetClient.invokeGreetService();
		
		return greetResponse+"  "+welResponse;
	}

}
