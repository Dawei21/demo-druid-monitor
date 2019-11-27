package com.sinbad.boot.druid.monitor.mapper;

import com.sinbad.boot.druid.monitor.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

}