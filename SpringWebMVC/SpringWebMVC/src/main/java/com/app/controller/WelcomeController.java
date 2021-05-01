package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String sayHellobyNameget(@RequestParam String name, ModelMap map)
	{
		map.addAttribute("user", name);
		map.addAttribute("request", "GET");
		
		return "dashboard";
	}
	
	@RequestMapping(value = "/welcomePost", method = RequestMethod.POST)
	public String sayHellobyNamepost(@RequestParam String name, ModelMap map)
	{
		map.addAttribute("user", name);
		map.addAttribute("request", "POST");
		
		return "dashboard";
	}

}
