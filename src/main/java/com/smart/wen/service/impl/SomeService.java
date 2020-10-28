package com.smart.wen.service.impl;

import com.smart.wen.service.ISomeService;

public class SomeService implements ISomeService {
    @Override
    public void show() {
        System.out.println("测试spring容器创建管理对象");
    }
}
