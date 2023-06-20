package com.ashok.it;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.ashok.it.entity.User;
import com.ashok.it.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		//sorting
		/*
		 * List<User> list = repository.findAll(Sort.by("userId").ascending());
		 * list.forEach(user -> {System.out.println(user);} );
		 */
		
		
		//pagination
		/*
		 * PageRequest request = PageRequest.of(0, 3); 
		 * Page<User> page = repository.findAll(request); page.forEach(user
		 * ->{System.out.println(user);});
		 */	
		//or
		/*
		 * List<User> list = repository.findAll(PageRequest.of(0, 3)).getContent();
		 * list.forEach(user -> {System.out.println(user);} );
		 */
		User userEntity=new User();
		userEntity.setUserAge(25);
		//userEntity.setUserPhno(956532545);
		Example<User> example = Example.of(userEntity);
		List<User> findAll = repository.findAll(example);
		for(User user: findAll)
		{
			System.out.println(user);
		}
	
	
	
	}

}
