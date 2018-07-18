package com.sz.dao.impl;

import com.sz.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void show() {
        System.out.println("调用UserDao");
    }
}
