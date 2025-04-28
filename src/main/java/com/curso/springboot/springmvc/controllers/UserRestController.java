package com.curso.springboot.springmvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springmvc.models.User;

@Controller
@RequestMapping("/api")
public class UserRestController {
	
	@GetMapping("/details")
	@ResponseBody
	public Map<String, Object> details() {
		
		User user = new User("Adrian", "Tobon");
		
		Map<String, Object> body = new HashMap<>();
		body.put("title","Spring MVC");
		body.put("user",user);		
		
		return body;
	}
	
	
	@RequestMapping(path="/details_2", method= RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> details_2() {
		
		User user = new User("Adrian", "Tobon");
		
		Map<String, Object> body = new HashMap<>();
		body.put("title","Spring MVC");
		body.put("user",user);		
		
		return body;
	}
	

}
