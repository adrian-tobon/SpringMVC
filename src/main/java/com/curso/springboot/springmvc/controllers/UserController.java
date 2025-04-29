package com.curso.springboot.springmvc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.curso.springboot.springmvc.models.User;

@Controller
public class UserController {
	
	@GetMapping("/details")
	public String details(Model model) {
		
		User user = new User("Adrian", "Tobon");
		user.setEmail("ctobonpe@gmail.com");
		
		model.addAttribute("title","Spring MVC");
		model.addAttribute("user",user);
			
		return "details";
	}
	
	@GetMapping("/list")
	public String list(ModelMap modelMap) {
		
		
		/*List<User> users = Arrays.asList(
				new User("Adrian","Tobon"),
				new User("Pepe","Doe"), 
				new User("John","Doe"),
				new User("Diana","Prince", "diana@correo.com"));
		*/
		modelMap.addAttribute("title","Spring MVC Lista");
		//modelMap.addAttribute("users", users);
		
		return "list";
	}
	
	@ModelAttribute("users")
	public List<User> usersModel(){
		
		List<User> users = Arrays.asList(
				new User("Adrian","Tobon"),
				new User("Pepe","Doe"), 
				new User("John","Doe"),
				new User("Diana","Prince", "diana@correo.com"));
		
		return users;		
	}	

}
