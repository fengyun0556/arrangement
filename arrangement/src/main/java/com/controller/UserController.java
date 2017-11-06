package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.PersonUser;

@Controller
@RequestMapping(value="/user")
public class UserController {

	private static List<PersonUser> userList;
	
	public UserController() {
		super();
		userList = new ArrayList<PersonUser>();
	}
	
	private static final Logger LOGGER = LogManager.getLogger(UserController.class);
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerForm() {
		LOGGER.info("used registerForm function");
		return "registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@RequestParam("loginname") String loginName, String password, String username) {
		LOGGER.info("used register function");
		PersonUser user = new PersonUser();
		user.setUserName(username);
		user.setUserPassword(password);
		user.setLoginName(loginName);
		userList.add(user);
		return "loginForm";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("loginname") String loginname, 
			@RequestParam("password") String password, Model model) {
		LOGGER.info("used login function");
		for (PersonUser personUser : userList) {
			if(loginname.equals(personUser.getLoginName()) && password.equals(personUser.getUserPassword())) {
				model.addAttribute("user", personUser);
				return "welcome";
			}
		}
		return "loginForm";
	}
	
	
	
	
	
	
}
