package com.sinbad.boot.druid.monitor.controllers;

import com.sinbad.boot.druid.monitor.service.UserInfoService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Dawei on 2019/11/17.
 */
@RestController
@RequestMapping(value = "/test/user")
public class TestUserInfoController {


    @Resource
    private UserInfoService userInfoService;

    @GetMapping(value = "/detail")
    public Object getUserInfoDetail(Long userId) {
        return userInfoService.getUserInfoByUserId(userId);
    }

}
