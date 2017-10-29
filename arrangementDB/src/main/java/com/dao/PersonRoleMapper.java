package com.dao;

import com.pojo.PersonRole;

public interface PersonRoleMapper {
    int deleteByPrimaryKey(Byte roleId);

    int insert(PersonRole record);

    int insertSelective(PersonRole record);

    PersonRole selectByPrimaryKey(Byte roleId);

    int updateByPrimaryKeySelective(PersonRole record);

    int updateByPrimaryKey(PersonRole record);
}