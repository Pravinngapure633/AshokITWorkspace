package com.ashok.it;

import java.util.Arrays;

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
		 * User u1 = new User(); u1.setUserId(101); u1.setUserName("VISHAL");
		 * u1.setUserPhno(956532545); u1.setUserAge(35); //repository.save(u1);
		 */

		/*
		 * User u2 = new User(); u2.setUserId(102); u2.setUserName("Pravin");
		 * u2.setUserPhno(956532545); u2.setUserAge(24);
		 * 
		 * User u3 = new User(); u3.setUserId(103); u3.setUserName("Saurabh");
		 * u3.setUserPhno(956532545); u3.setUserAge(25);
		 * 
		 * repository.saveAll(Arrays.asList(u2,u3));
		 */

		/*
		 * Optional<User> findById = repository.findById(101); if(findById.isPresent())
		 * { System.out.println(findById.get()); }
		 */

		/*
		 * Iterable<User> findAllById = repository.findAllById(Arrays.asList(101,102));
		 * findAllById.forEach(user ->{ System.out.println(user); });
		 */

		/*
		 * Iterable<User> findAll = repository.findAll(); findAll.forEach(user -> {
		 * System.out.println(user); });
		 */

		// System.out.println(repository.existsById(101));

		// System.out.println(repository.count());

		// repository.delete(u1);

		//repository.deleteById(102);

		//repository.deleteAllById(Arrays.asList(101,102));
	}

}
