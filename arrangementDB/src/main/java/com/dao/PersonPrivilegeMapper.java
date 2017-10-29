package com.dao;

import com.pojo.PersonPrivilege;

public interface PersonPrivilegeMapper {
    int deleteByPrimaryKey(Byte privilegeId);

    int insert(PersonPrivilege record);

    int insertSelective(PersonPrivilege record);

    PersonPrivilege selectByPrimaryKey(Byte privilegeId);

    int updateByPrimaryKeySelective(PersonPrivilege record);

    int updateByPrimaryKey(PersonPrivilege record);
}