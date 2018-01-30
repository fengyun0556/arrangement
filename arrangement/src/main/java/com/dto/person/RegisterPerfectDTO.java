package com.dto.person;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 完善注册信息
 * @author yangzf
 * @since 2017年12月10日 下午4:23:19
 */
public class RegisterPerfectDTO {

	@NotBlank(message="登录名不可为空！")
    private String loginName;

    @NotBlank(message="用户姓名不可为空！")
    private String userName;

    private String sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past(message="生日必须是过去的日期！")
    private Date birthday;

	@Email(message="必须是合法邮箱！")
    private String email;

	@Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$", message="无效的电话号码！")
    private String mobilePhone;

    private Byte departmentId;

    private Byte employeeTypeId;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Byte getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Byte departmentId) {
		this.departmentId = departmentId;
	}

	public Byte getEmployeeTypeId() {
		return employeeTypeId;
	}

	public void setEmployeeTypeId(Byte employeeTypeId) {
		this.employeeTypeId = employeeTypeId;
	}
    
}
