package com.hadly.dal.service.impl;

import com.hadly.dal.mapper.InstInfoMapper;
import com.hadly.dal.model.InstInfo;
import com.hadly.dal.service.IInstInfoDao;

/**
 * Created by hadly on 2017/9/11.
 */
public class InstInfoDaoImpl implements IInstInfoDao{
    private InstInfoMapper instInfoMapper;

    public void insert(InstInfo record) {
        instInfoMapper.insert(record);
        return;
    }
}
