package com.controller.person;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pojo.PersonUser;

public class RegisterValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return PersonUser.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "loginName", null, "登录名称不可为空！");
		ValidationUtils.rejectIfEmpty(errors, "userPassword", null, "密码不可为空！");
		ValidationUtils.rejectIfEmpty(errors, "userName", null, "用户姓名不可为空！");
		ValidationUtils.rejectIfEmpty(errors, "sex", null, "性别必选！");
		ValidationUtils.rejectIfEmpty(errors, "email", null, "邮箱不可为空！");
		ValidationUtils.rejectIfEmpty(errors, "mobilePhone", null, "手机号码不可为空！");
		ValidationUtils.rejectIfEmpty(errors, "departmentId", null, "部门不可为空！");
		ValidationUtils.rejectIfEmpty(errors, "employeeTypeId", null, "员工类型不可为空！");
	}

}
