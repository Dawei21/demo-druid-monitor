package com.sinbad.boot.druid.monitor.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author by Dawei on 2019/11/17.
 */
@Configuration
public class BootFilterConfiguration {

//    @Bean
//    public FilterRegistrationBean statFilter(){
//        //创建过滤器
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
//        //设置过滤器过滤路径
//        filterRegistrationBean.addUrlPatterns("/*");
//        //忽略过滤的形式
//        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        //缺省sessionStatMaxCount是1000个。你可以按需要进行配置
//        filterRegistrationBean.addInitParameter("sessionStatMaxCount","1000");
//        //druid 0.2.7版本开始支持profile，配置profileEnable能够监控单个url调用的sql列表
//        filterRegistrationBean.addInitParameter("profileEnable", "true");
//        //你可以关闭session统计功能
//        filterRegistrationBean.addInitParameter("sessionStatEnable","false");
//
//        return filterRegistrationBean;
//    }
}
