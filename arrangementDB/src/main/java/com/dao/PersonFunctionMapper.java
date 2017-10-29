package com.dao;

import com.pojo.PersonFunction;

public interface PersonFunctionMapper {
    int deleteByPrimaryKey(Byte functionId);

    int insert(PersonFunction record);

    int insertSelective(PersonFunction record);

    PersonFunction selectByPrimaryKey(Byte functionId);

    int updateByPrimaryKeySelective(PersonFunction record);

    int updateByPrimaryKey(PersonFunction record);
}