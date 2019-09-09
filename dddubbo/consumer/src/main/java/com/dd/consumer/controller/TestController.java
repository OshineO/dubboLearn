package com.dd.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dd.api.testinterface.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    TestService testService; // 这个接口是api里面定义的接口

    @RequestMapping("/hello")
    public String testHello(String name) {
        return testService.testHello(name);
    }

}
