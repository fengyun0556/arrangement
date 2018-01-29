package com.controller.person;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.classUtility.TransferField;
import com.dto.person.RegisterInitDTO;
import com.pojo.PersonUser;
import com.service.PersonUserService;

/**
 * 登陆控制
 * 
 * @author yangzf
 * @since 2018年1月28日 下午4:14:47
 */
@Controller
@RequestMapping(value = "/person")
@SessionAttributes("personUser")
public class LoginController {

	public static final Logger LOGGER = LogManager.getLogger(RegisterController.class);

	@Resource
	private PersonUserService personUserService;

	/**
	 * 登录，校验用户名密码
	 * @author yangzf
	 * @since 2018年1月28日 下午4:15:13
	 */
	@RequestMapping(value="/login")
	public String login(@ModelAttribute @Valid RegisterInitDTO registerInitDTO, Errors errors, Model model) {
		if(!errors.hasFieldErrors()) {
			TransferField transferField = TransferField.getTransferFieldInstance();
			PersonUser personUser = new PersonUser();
			transferField.transferFields(personUser, registerInitDTO);//将前台展示的DTO中的值转到pojo中
			PersonUser loginPersonUser = personUserService.selectByLogin(personUser); 
			if(loginPersonUser != null) {
				model.addAttribute("personUser", loginPersonUser);
				return "redirect:init.do";
			}
		}
		//入参有错，或用户名密码不对，返回重新登录
		return "person/loginForm";
	}

	/**
	 * 初始化登录界面
	 * 
	 * @author yangzf
	 * @since 2018年1月28日 下午4:10:14
	 */
	@RequestMapping(value = "/loginForm")
	public String loginForm(Model model) {
		RegisterInitDTO registerInitDTO = new RegisterInitDTO();
		model.addAttribute(registerInitDTO);
		return "person/loginForm";
	}
}
