package com.sz.service.impl;

import com.sz.service.UserService;

public class UserServiceImlp implements UserService {

    @Override
    public void eat() {
        System.out.println("调用UserService");
    }
}
