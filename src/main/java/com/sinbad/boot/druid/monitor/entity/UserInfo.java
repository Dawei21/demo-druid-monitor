package com.sinbad.boot.druid.monitor.entity;

import lombok.Data;

@Data
public class UserInfo {
    private Long id;

    private Long userId;

    private String userName;

    private Integer blackStatus;

    private Long createTime;

    private Long updateTime;


}