package com.curso.springboot.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.springboot.springmvc.models.User;

@Controller
public class UserController {
	
	@GetMapping("/details")
	public String details(Model model) {
		
		User user = new User("Adrian", "Tobon");
		
		model.addAttribute("title","Spring MVC");
		model.addAttribute("user",user);
			
		return "details";
	}

}
