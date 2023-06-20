package com.ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.binding.Student;

@Controller
public class StudentController {

	@GetMapping("/student")
	public String loadForm(Model m)
	{
		m.addAttribute("student", new Student());
		return "index";
	}
	
	
	@PostMapping("/saveStudent")
	public String handleRegisterButton(Student student, Model m)
	{
		System.out.println(student);
		String name = student.getName();
		String msgg=name+", Your registration completed********";
		m.addAttribute("msg", msgg);
		return "success";
	}
}
