package com.ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetConttroller {

	@GetMapping("/greet")
	public String greetMsg(Model m)
	{
		m.addAttribute("msg", "gud night");
		return "index";
	}
}
