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
	public PersonUser getPersonUserByUserId(Integer userId) {
		return personUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public PersonUser selectByLogin(PersonUser personUser) {
		return personUserServiceDao.selectByLogin(personUser);
	}

}
