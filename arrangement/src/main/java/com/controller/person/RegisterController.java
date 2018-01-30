package com.controller.person;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.baseInfoUtility.PublicPersonelInfo;
import com.classUtility.TransferField;
import com.dto.person.RegisterPerfectDTO;
import com.pojo.PersonUser;
import com.service.PersonUserService;

@Controller
@RequestMapping(value = "/person")
@SessionAttributes("personUser")
public class RegisterController {

	public static final Logger LOGGER = LogManager.getLogger(RegisterController.class);

	@Resource
	private PublicPersonelInfo publicPersonelInfo;
	
	@Resource
	private PersonUserService personUserService;
	
	/**
	 * 跳转至注册页面
	 * 
	 * @since 2017年11月26日 下午3:11:09
	 */
	@RequestMapping(value = "registerInit")
	public String registerInit(Model model) {
		PersonUser personUser = new PersonUser();
		model.addAttribute("personUser", personUser);
		return "person/registerInit";
	}

	/**
	 * 提交注册
	 * 
	 * @since 2017年11月26日 下午4:22:03
	 */
	@RequestMapping(value = "/register")
	public String register(@Valid @ModelAttribute PersonUser personUser, Errors errors, Model model) {
		if(!errors.hasFieldErrors()) {
			//入参无误，将注册信息插入数据库
			if(personUserService.insertUser(personUser)) {
				model.addAttribute("personUser", personUser);
				return "person/success";
			}
		}
		//入参有误或插入数据库失败，返回注册初始化页面
		return "person/registerInit";
	}
	
	/**
	 * 已注册过的账号，完善账号信息
	 * @author yangzf
	 * @since 2018年1月28日 下午9:09:08
	 */
	@RequestMapping(value = "registerPerfect/{loginName}")
	public String registerPerfectInit(Model model, @PathVariable String loginName) {
		PersonUser personUser = personUserService.getPersonUserByUserId(loginName);
		
		RegisterPerfectDTO registerPerfectDTO = new RegisterPerfectDTO();
		TransferField transferField = TransferField.getTransferFieldInstance();
		transferField.transferFields(registerPerfectDTO, personUser);
		model.addAttribute("registerPerfectDTO", registerPerfectDTO);
		
		this.prepareViewData(model);
		return "person/registerPerfect";
	}
	
	/**
	 * 提交完善账户资料的请求
	 * @author yangzf
	 * @since 2018年1月29日 下午10:20:48
	 */
	@RequestMapping(value = "registerPerfectCommit")
	public String registerPerfectCommit(@ModelAttribute @Valid RegisterPerfectDTO registerPerfectDTO, 
			Errors errors, Model model) {
		if(!errors.hasFieldErrors()) {
			TransferField transferField = TransferField.getTransferFieldInstance();
			PersonUser personUser = new PersonUser();
			transferField.transferFields(personUser, registerPerfectDTO);
			if(personUserService.updatePersonUser(personUser)) {
				return "person/success";
			}
		}
		this.prepareViewData(model);
		model.addAttribute("registerPerfectDTO", registerPerfectDTO);
		return "person/registerPerfect";
	}
	
	/**
	 * 准备页面显示的基础数据
	 * @param model
	 * @since 2017年11月26日 下午9:20:18
	 */
	private void prepareViewData(Model model) {
		model.addAttribute("sexMap", publicPersonelInfo.getSexMap());
		model.addAttribute("employeeTypeMap", publicPersonelInfo.getEmployeeTypeMap());
		model.addAttribute("departmentMap", this.getDepartmentMap());
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
