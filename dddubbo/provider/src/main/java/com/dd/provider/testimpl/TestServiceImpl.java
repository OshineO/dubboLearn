package com.dd.provider.testimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dd.api.testinterface.TestService;


@Service
public class TestServiceImpl implements TestService {
    @Override
    public String testHello(String name) {
        return "hello " + name;
    }
}
