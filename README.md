### 190123demo 分支

    是一个最基础的demo，使用的是spring boot整合dubbo + zookeeper的方式。 pull到本地后。先在本地启动一个zookeeper就可以直接启动项目了。或者修改DubboConfig文件中的地址zookeeper://127.0.0.1:2181 改成对应的zookeeper地址就可以了。 然后先启动provider，在启动consumer。最后访问http://localhost:9872/test/hello?name=diandi 测试就可以了。

### 190123demoStart 分支

    也是一个最基础的demo，使用的是dubbo-spring-boot-starter快捷启动方式，只需要在配置文件中配置相应的属性。简单方便。后续都在这一套的基础上添加。

### 190305LoadBalance 分支
    测试负载均衡。当启动多个示例的时候。 改变器server.port服务的端口和dubbo.protocol.port dubbo暴露的的端口。
### 190307Hystrix 分支
    测试熔断，降级，限流。
### 20190312Sort 分支。
    各种排序算法。
## 190308Sentinel 分支
    用sentinel来尝试熔断降级限流。
