package com.curso.springboot.springmvc.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
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

	@Value("${config.username}")
	private String username;
	
//	  @Value("${config.message}")
//	  private String message;

	@Value("${config.code}")
	private Integer code;

	@Value("${config.listOfValues}")
	private List<String> listOfValues;
	
	@Value("#{'${config.listOfValues}'.split(',')}")
	private List<String> valueList;
	
	@Value("#{'${config.listOfValues}'.toUpperCase()}")
	private String list;

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
		params.setCode(codigo);
		return params;
	}

	@PostMapping("/create")
	public User create(@RequestBody User user) {

		// en teoria, crear un usario en la DB
		user.setName(user.getName().toUpperCase());
		return user;
	}

	@GetMapping("/values")
	public Map<String, Object> values(@Value("${config.message}") String message) {

		Map<String, Object> json = new HashMap<>();
		json.put("code", code);
		json.put("username", username);
		json.put("message", message);
		json.put("list_of_values", listOfValues);
		json.put("value_list", valueList);
		json.put("list", list);
		return json;
	}

}
