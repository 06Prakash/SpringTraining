package com.test.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.j2eeweb.UserValidationService;

@Controller
public class LoginController {

	@Autowired
	UserValidationService service;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(service.IsValidUser(name, password)) {
			System.out.println(name);
			model.addAttribute("name", name);
			model.addAttribute("password", password);
			return "welcome";
		}
		else {
			System.out.println(name);
			model.addAttribute("errorMessage", "Not a valid credential!!!");
			return "welcome";
		}
	}
	
	@RequestMapping(value = "/welcome")
	public String sayWelcome() {
		return "welcome";
	}
}
