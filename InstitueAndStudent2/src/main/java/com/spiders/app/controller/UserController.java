package com.spiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spiders.app.dto.UserDto;

@Controller
public class UserController {
	
	@RequestMapping("/")
	String displayIndex(){
		System.out.println("----------------------[");
		System.out.println("inside method ");	
		// this is a page name
		return "AddUser";
	}

	// uri name
	@RequestMapping(value ="/addUser" ,method= RequestMethod.POST)
	String AddUser(UserDto user , BindingResult result){
		
		if(result.hasErrors()) {
			String errorField = result.getFieldError().getField();
			System.out.println(errorField);		
		}
		else {
			System.out.println("----------------------");
			System.out.println("Add user method ");
			System.out.println(user);
		}
		
		return "AddUser";
	}
		
	@RequestMapping(value = "/getUserDetails" , method= RequestMethod.GET) 
	ModelAndView getDetails(){
		System.out.println("----------------------[");
		System.out.println("inside method ");
		
		return new ModelAndView("");
	}
	
}
