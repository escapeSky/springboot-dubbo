package com.demo.service.impl;

import com.demo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author caoyy
 * @createDate 2020/8/7 15:42
 * @Description:
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
