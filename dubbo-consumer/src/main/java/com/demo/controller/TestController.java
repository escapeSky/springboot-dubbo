package com.demo.controller;

import com.demo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caoyy
 * @createDate 2020/8/10 10:24
 * @Description:
 */
@Controller
public class TestController {
    @Reference
    HelloService helloServiceImpl;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name) {
        return helloServiceImpl.sayHello(name);
    }
}
