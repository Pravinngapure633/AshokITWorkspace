package com.ashok.it;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		 //logic to execute one timee
		 System.out.println("MyCmdRunner :: run() method got execuate");
		
	}
}
