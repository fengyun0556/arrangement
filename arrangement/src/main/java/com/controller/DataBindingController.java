package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/data")
public class DataBindingController {

	private static final Logger LOGGER = LogManager.getLogger(DataBindingController.class);
	
	@RequestMapping("/init")
	public String init() {
		return "dataInit";
	}
	
	@RequestMapping(value="/pathVariableTest/{userId}")
	public void pathVariableTest(@PathVariable Integer userId) {
		LOGGER.info("pathVariableTest userId = " + userId);
	}
	
	@RequestMapping(value="/requestHeaderTest")
	public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent,@RequestHeader("Accept") String[] accepts) {
		LOGGER.info("requestHeaderTest userAgent = " + userAgent);
		for (String accept : accepts) {
			LOGGER.info(accept);
		}
	}

	@RequestMapping(value="/cookieValueTest")
	public void cookieValueTest(@CookieValue(value="JSESSIONID", defaultValue="") String sessionId) {
		LOGGER.info("cookieValueTest sesionId = " + sessionId);
	}
	
}
