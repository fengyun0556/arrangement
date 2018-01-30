package com.service;

import com.pojo.PersonUser;

public interface PersonUserService {

	public boolean insertUser(PersonUser personUser);
	
	public PersonUser getPersonUserByUserId(String loginName);
	
	public PersonUser selectByLogin(PersonUser personUser);
	
	public boolean updatePersonUser(PersonUser personUser);
	
}
