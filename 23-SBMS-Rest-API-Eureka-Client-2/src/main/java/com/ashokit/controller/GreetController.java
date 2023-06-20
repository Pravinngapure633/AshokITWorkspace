package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	//for load balancing
	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String greetMsg() {
		
		String portNum = env.getProperty("server.port");
		
		
		
		return "Good Morning...!! [Server port ::"+portNum+"]";
	}
}
