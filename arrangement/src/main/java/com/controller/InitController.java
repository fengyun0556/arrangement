package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("person")
public class InitController {

	@RequestMapping(value="/init.do")
	public String init(Model model) {
		return "init";
	}
}
