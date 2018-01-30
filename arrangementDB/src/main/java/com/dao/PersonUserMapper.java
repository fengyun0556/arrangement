package com.dao;

import com.pojo.PersonUser;

public interface PersonUserMapper {
    int deleteByPrimaryKey(String loginName);

    int insert(PersonUser record);

    int insertSelective(PersonUser record);

    PersonUser selectByPrimaryKey(String loginName);

    int updateByPrimaryKeySelective(PersonUser record);

    int updateByPrimaryKey(PersonUser record);
}