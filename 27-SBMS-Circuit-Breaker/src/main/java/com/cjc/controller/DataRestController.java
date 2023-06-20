package com.cjc.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController

public class DataRestController {

	
	@GetMapping("/data")
	@HystrixCommand(
			fallbackMethod = "getDataFromDB",
			commandProperties = {
					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
					@HystrixProperty(name = "circuitBreaker.sleepWindowInMiliseconds", value = "10000"),
					@HystrixProperty(name = "circuitBreaker.enabled", value = "true")
			}
			)
	public String getDataFromRedis() {
		System.out.println("**getDataFromRedis() method called");
		
		if(new Random().nextInt(10)<=10) {
			throw new RuntimeException("Redis Server Down");
			}
		
		//logic to access data from radis
		return "Data Accessed From redis";
	}
	
	
	public String getDataFromDB() {
		System.out.println("**getDataFromDB() method called");
		//logic to access daata from db
		return "Data Accessed From DB";
		
	}
}
