package com.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String sayHello() {
		return "login";
	}
	
	@RequestMapping(value = "/welcome")
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to Hello, world";
	}
}
