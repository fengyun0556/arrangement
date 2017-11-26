package com.controller.person;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.PersonUser;

@Controller
@RequestMapping(value = "/person")
public class RegisterController {

	public static final Logger LOGGER = LogManager.getLogger(RegisterController.class);

	/**
	 * 跳转至注册页面
	 * 
	 * @2017年11月26日 @下午3:11:09
	 */
	@RequestMapping(value = "registerInit")
	public String registerInit(Model model) {
		PersonUser personUser = new PersonUser();
		this.prepareViewData(model, personUser);
		return "person/registerInit";
	}

	@InitBinder
	public void initBinder(DataBinder binder) {
		binder.setValidator(new RegisterValidator());
	}
	
	/**
	 * 提交注册
	 * 
	 * @2017年11月26日 @下午4:22:03
	 */
	@RequestMapping(value = "/register")
	public String register(@Validated PersonUser personUser, Errors errors, Model model) {
		LOGGER.info(personUser);
		if (errors.hasFieldErrors()) {
			this.prepareViewData(model, personUser);
			return "person/registerInit";
		} else {
			model.addAttribute("personUser", personUser);
			return "person/success";
		}
	}
	
	/**
	 * 准备页面显示的基础数据
	 * @param model
	 * @param personUser
	 * @2017年11月26日 @下午9:20:18
	 */
	private void prepareViewData(Model model, PersonUser personUser) {
		model.addAttribute("sexMap", this.getSexMap());
		model.addAttribute("employeeTypeMap", this.getEmployeeTypeMap());
		model.addAttribute("departmentMap", this.getDepartmentMap());
		model.addAttribute("personUser", personUser);
	}
	
	private Map<Integer, String> getSexMap(){
		Map<Integer, String> sexMap = new HashMap<Integer, String>();
		sexMap.put(0, "男");
		sexMap.put(1, "女");
		sexMap.put(2, "保密");
		return sexMap;
	}
	
	private Map<Integer, String> getEmployeeTypeMap(){
		Map<Integer, String> employeeTypeMap = new HashMap<Integer, String>();
		employeeTypeMap.put(1, "正式员工");
		employeeTypeMap.put(2, "实习员工");
		employeeTypeMap.put(3, "临时员工");
		return employeeTypeMap;
	}
	
	private Map<String, String> getDepartmentMap(){
		Map<String, String> departmentMap = new HashMap<String, String>();
		departmentMap.put("001", "核心组");
		departmentMap.put("002", "运维组");
		departmentMap.put("003", "电商组");
		departmentMap.put("004", "第三方组");
		departmentMap.put("005", "BI组");
		return departmentMap;
	}
	
	
	
}
