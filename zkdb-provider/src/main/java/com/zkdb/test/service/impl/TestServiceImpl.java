package com.zkdb.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zkdb.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        System.out.println("this is provider impl ,your input is :"+name);
        return name;
    }
}
