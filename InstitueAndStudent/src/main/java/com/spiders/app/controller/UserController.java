package com.spiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spiders.app.dto.UserDto;

@Controller
@RequestMapping("api")
public class UserController {
	
	@RequestMapping("/deflaut")
	String displayIndex(){
		System.out.println("----------------------[");
		System.out.println("inside method ");	
		return "index";
	}
	
	
	
	
	@RequestMapping("/getUserDetails")
	ModelAndView getDetails(){
		System.out.println("----------------------[");
		System.out.println("inside method ");
		
		
		return new ModelAndView("");
	}
	
	

}
