package com.dao;

import com.pojo.PersonUser;

public interface PersonUserServiceDao {

	/**
	 * 根据用户名密码查找用户，登录时用
	 * @author yangzf
	 * @since 2018年1月28日 下午6:55:26
	 */
	public PersonUser selectByLogin(PersonUser personUser);
}
