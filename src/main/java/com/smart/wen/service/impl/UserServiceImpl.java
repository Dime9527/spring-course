package com.smart.wen.service.impl;

import com.smart.wen.dao.UserDao;
import com.smart.wen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //@Resource 他是Java中的jsr250标准,支持按名字或类型查找
    //@Autowired只能按类型查找，加上@Qualifier可以实现按名字查找
    @Autowired
    //@Qualifier("")
    UserDao userDao;

    @Override
    public void show2() {
        userDao.show3();
    }
}
