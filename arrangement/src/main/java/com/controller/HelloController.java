package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	private static final Logger logger = LogManager.getLogger(HelloController.class);
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello1(Model model) {
		logger.info("handleRequest hello1 被调用");
		model.addAttribute("message", "hello world");
		model.addAttribute("method", "get");
		return "welcome";
	}

	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String hello2(Model model) {
		logger.info("handleRequest hello2 被调用");
		model.addAttribute("message", "hello world");
		model.addAttribute("method", "post");
		return "welcome";
	}
}
