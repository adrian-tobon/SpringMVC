package com.curso.springboot.springmvc.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springmvc.models.User;
import com.curso.springboot.springmvc.models.dto.UserDTO;

@RestController
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
	public Map<String, Object> details_2() {
		
		User user = new User("Adrian", "Tobon");
		
		Map<String, Object> body = new HashMap<>();
		body.put("title","Spring MVC");
		body.put("user",user);		
		
		return body;
	}
	
	@GetMapping("/details_dto")
	public UserDTO details_dto() {
		
		UserDTO userDto = new UserDTO();		
		User user = new User("Adrian", "Tobon");
		
		userDto.setUser(user);
		userDto.setTitle("Spring MVC");				
		
		return userDto;
	}
	
	@GetMapping("/list")
	public List<User> list(){
		
		User user = new User("Adrian", "Tobon");
		User user2 = new User("Pepe", "Doe");
		User user3 = new User("John", "Doe");		
		
		//uso de Helper
		List<User> users = Arrays.asList(user,user2,user3);
		
		/*
		 * List<User> users = new ArrayList<>(); 
		 * users.add(user); 
		 * users.add(user2);
		 * users.add(user3);
		 */
		
		return users;		
	}
	

}
