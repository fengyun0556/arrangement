package com.controller.person;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.person.RegisterInitDTO;

@Controller
@RequestMapping("/person")
public class LogoutController {

	@RequestMapping("/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		RegisterInitDTO registerInitDTO = new RegisterInitDTO();
		model.addAttribute("registerInitDTO", registerInitDTO);
		return "person/loginForm";
	}
}
