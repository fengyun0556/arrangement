package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PersonUserMapper;
import com.dao.PersonUserServiceDao;
import com.pojo.PersonUser;
import com.service.PersonUserService;

@Service("personUserService")
public class PersonUserServiceImpl implements PersonUserService {

	@Resource
	private PersonUserMapper personUserMapper;
	
	@Resource
	private PersonUserServiceDao personUserServiceDao;
	
	@Override
	public boolean insertUser(PersonUser personUser) {
		return this.personUserMapper.insert(personUser)>0?true:false;
	}

	@Override
	public PersonUser getPersonUserByUserId(String loginName) {
		return personUserMapper.selectByPrimaryKey(loginName);
	}

	@Override
	public PersonUser selectByLogin(PersonUser personUser) {
		return personUserServiceDao.selectByLogin(personUser);
	}

	@Override
	public boolean updatePersonUser(PersonUser personUser) {
		return personUserMapper.updateByPrimaryKeySelective(personUser) > 0 ? true : false;
	}

}
