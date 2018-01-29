package com.dto.person;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * 刚注册时需要的数据
 * @author yangzf
 * @since 2017年12月10日 下午4:21:05
 */
public class RegisterInitDTO implements Serializable {

	@NotBlank(message="登录名不可为空！")
    private String loginName;

	@NotEmpty(message="密码不可为空！")
    private String userPassword;
	
	private static final long serialVersionUID = 1L;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
