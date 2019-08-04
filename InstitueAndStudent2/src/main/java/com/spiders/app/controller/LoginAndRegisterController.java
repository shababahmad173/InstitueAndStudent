package com.spiders.app.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spiders.app.dto.LoginDetials;

@Controller
public class LoginAndRegisterController {

	Logger log = Logger.getLogger(LoginAndRegisterController.class);

	@RequestMapping(value = "/signIn")
	String displaySignInPage() {
		// System.out.println("display sign in page");
		log.trace("display sign in page");

		return "SignInPage";
	}

	@RequestMapping(value = "/loginInUser")
	String getSignInDetails(LoginDetials detials) {
		// System.out.println("get sign in page details");
		log.trace("get in sign in page details");
		System.out.println(detials);
		return "SignInPage";
	}

	@RequestMapping(value = "/signUp")
	String displaySignUpPage() {
		System.out.println("display sign up page");
		return "SignUpPage";
	}

	String getSignUpDetails() {
		System.out.println("get display sign up page details");
		return "";
	}

}
