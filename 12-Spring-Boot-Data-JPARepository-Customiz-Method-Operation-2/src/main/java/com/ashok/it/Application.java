package com.ashok.it;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashok.it.entity.User;
import com.ashok.it.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		/*
		 * List<User> list = repository.findByuserAge(24); for(User u:list) {
		 * System.out.println(u); }
		 */
		
		/*
		 * List<User> list = repository.findByuserName("SUDA"); for(User u:list) {
		 * 
		 * System.out.println(u); }
		 */
	
		/*
		 * List<User> list = repository.findByuserPhno(956532545); for(User u:list) {
		 * 
		 * System.out.println(u); }
		 * 
		 */
		//Multiple age
		/*
		 * List<User> list = repository.findByuserAgeIn(Arrays.asList(24,25)); for(User
		 * u:list) { System.out.println(u); }
		 */
		//Cutomize query
		/*
		 * List<User> byAge = repository.getByAge(24); for(User u:byAge) {
		 * System.out.println(u); }
		  }*/

//		List<User> list = repository.findByUserAgeAndUserName(24, "Vishal");
//		for(User u:list)
//		{
//			System.out.println(u);
//		}
	
	}
}
