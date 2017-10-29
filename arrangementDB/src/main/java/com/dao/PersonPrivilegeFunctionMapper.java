package com.dao;

import com.pojo.PersonPrivilegeFunctionKey;

public interface PersonPrivilegeFunctionMapper {
    int deleteByPrimaryKey(PersonPrivilegeFunctionKey key);

    int insert(PersonPrivilegeFunctionKey record);

    int insertSelective(PersonPrivilegeFunctionKey record);
}