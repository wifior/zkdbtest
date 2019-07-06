package com.zkdb.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zkdb.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("index/{name}")
    public String index(@PathVariable String name){
        return testService.sayHello(name);
    }
}
