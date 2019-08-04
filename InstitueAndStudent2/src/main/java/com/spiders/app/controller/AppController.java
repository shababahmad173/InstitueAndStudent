package com.spiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	String displayIndex(){
		System.out.println("Entry point");	
		return "index";
	}
	
	
}
