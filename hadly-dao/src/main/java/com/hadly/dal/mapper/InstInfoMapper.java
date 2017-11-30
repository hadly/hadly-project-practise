package com.hadly.dal.mapper;

import com.hadly.dal.model.InstInfo;

public interface InstInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InstInfo record);

    int insertSelective(InstInfo record);

    InstInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InstInfo record);

    int updateByPrimaryKey(InstInfo record);
}