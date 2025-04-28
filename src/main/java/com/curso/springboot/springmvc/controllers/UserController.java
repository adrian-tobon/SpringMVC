package com.curso.springboot.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/details")
	public String details(Model model) {
		
		model.addAttribute("title","Spring MVC");
		model.addAttribute("name","Adrian");
		model.addAttribute("last_name","Tobon");		
		return "details";
	}

}
