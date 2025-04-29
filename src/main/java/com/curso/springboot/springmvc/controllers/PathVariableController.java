package com.curso.springboot.springmvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springmvc.models.User;
import com.curso.springboot.springmvc.models.dto.ParamDTO;
import com.curso.springboot.springmvc.models.dto.ParamsDTO;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

	@GetMapping("/baz/{message}")
	public ParamDTO baz(@PathVariable String message) {
		
	ParamDTO param = new ParamDTO();
		param.setMessage(message);
		return param;
	}
	
	@GetMapping("/bazs/{text}/{code}")
	public ParamsDTO bazs(@PathVariable String text, @PathVariable Integer code) {
		
		Integer codigo = 0;
		ParamsDTO params = new ParamsDTO();
		params.setText(text);
		
//		try {
//			codigo = code;			
//		}catch(MethodArgumentTypeMismatchException e) {}
		
		params.setCode(codigo);
		return params;
	}
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		
		//en teoria, crear un usario en la DB
		user.setName(user.getName().toUpperCase());		
		return user;
	}
	
}
