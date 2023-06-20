package com.ashok.it;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
	
		System.out.println("Engiine :: Const");
	}
	//2nd way annotation based
	@PostConstruct
	public void init()
	{
		System.out.println("**Engine :: init() called");
			
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("**Engine :: destroy() called");
	}
}
