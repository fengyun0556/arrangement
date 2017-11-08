package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pojo.PersonUser;

@Controller
@SessionAttributes("user")
public class SessionAttributeController {

	private static final Logger LOGGER = LogManager.getLogger(SessionAttributeController.class);
	
	@RequestMapping("/{formName}")
	public String loginForm(@PathVariable String formName) {
		return formName;
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("loginname") String loginName, 
			String password, Model model) {
		PersonUser user = new PersonUser();
		user.setLoginName(loginName);
		user.setUserPassword(password);
		user.setUserName("admin");
		LOGGER.info("user = " + user);
		model.addAttribute("user", user);
		return "welcome";
	}
}
