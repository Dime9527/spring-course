package com.smart.wen.dao.impl;

import com.smart.wen.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void show3() {
        System.out.println("dao层的实现类的方法");
    }
}
