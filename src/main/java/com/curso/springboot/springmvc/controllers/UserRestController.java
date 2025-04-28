package com.curso.springboot.springmvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springmvc.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	@GetMapping("/details")
	public Map<String, Object> details() {
		
		User user = new User("Adrian", "Tobon");
		
		Map<String, Object> body = new HashMap<>();
		body.put("title","Spring MVC");
		body.put("user",user);		
		
		return body;
	}

}
