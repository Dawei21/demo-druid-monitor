package com.sinbad.boot.druid.monitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Mybatis 扫包
@MapperScan(basePackages="com.sinbad.boot.druid.monitor.mapper")
//启用事务管理
@EnableTransactionManagement
@SpringBootApplication
public class DemoDruidMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDruidMonitorApplication.class, args);
    }

}
