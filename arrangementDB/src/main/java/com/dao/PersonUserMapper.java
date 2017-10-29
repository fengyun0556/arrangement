package com.dao;

import com.pojo.PersonUser;

public interface PersonUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(PersonUser record);

    int insertSelective(PersonUser record);

    PersonUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(PersonUser record);

    int updateByPrimaryKey(PersonUser record);
}