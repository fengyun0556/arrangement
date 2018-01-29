package com.service;

import com.pojo.PersonUser;

public interface PersonUserService {

	public boolean insertUser(PersonUser personUser);
	
	public PersonUser getPersonUserByUserId(Integer userId);
	
	public PersonUser selectByLogin(PersonUser personUser);
}
