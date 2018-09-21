package com.lanpang.server.controller;

import com.lanpang.server.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: order
 * @description:
 * @author: yanghao
 * @create: 2018-09-17 15:11
 **/
//加了这个注解的地方才能触发刷新配置
@RefreshScope
@RestController
@RequestMapping("/env")
public class EnvController {
    @Autowired
    private GirlConfig girlConfig;

    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String print(){
        return "env:"+env;
    }
    @GetMapping("/girl")
    public String girl(){

        return "name:"+girlConfig.getName()+"age:"+girlConfig.getAge();
    }
}
