package com.ashok.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashok.it.admin.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public String getUserData(Model m)
	{
		User user=new User(101, "Pravin");
		m.addAttribute("u", user);
		
		return "abc";
	}
}
