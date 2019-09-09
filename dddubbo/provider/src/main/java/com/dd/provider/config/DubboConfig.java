package com.dd.provider.config;


import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DubboConfig {
    @Bean
    public ApplicationConfig applicationConfig() {
        //提供方应用信息，用于计算依赖关系
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-test");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        // 使用zookeeper注册中心暴露服务地址
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        // 使用curator客户端
        registryConfig.setClient("curator");
        return registryConfig;
    }
}
