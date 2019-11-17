package com.sinbad.boot.druid.monitor.service;

import com.sinbad.boot.druid.monitor.entity.UserInfo;
import com.sinbad.boot.druid.monitor.mapper.UserInfoMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author by Dawei on 2019/11/17.
 */
@Service
public class UserInfoService {


    @Resource
    private UserInfoMapper userInfoMapper;


    public UserInfo getUserInfoByUserId(Long userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

}
