package com.ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetConttroller {

	@GetMapping("/greet")
	public ModelAndView greetMsg()
	{
		ModelAndView m = new ModelAndView();
		m.addObject("msg", "Good morning");
		m.setViewName("index");
		
		return m;
	}
}
