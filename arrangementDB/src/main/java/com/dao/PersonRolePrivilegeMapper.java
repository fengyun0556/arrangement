package com.dao;

import com.pojo.PersonRolePrivilegeKey;

public interface PersonRolePrivilegeMapper {
    int deleteByPrimaryKey(PersonRolePrivilegeKey key);

    int insert(PersonRolePrivilegeKey record);

    int insertSelective(PersonRolePrivilegeKey record);
}