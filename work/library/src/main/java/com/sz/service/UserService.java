package com.sz.service;

import com.sz.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    int getFindUser(@Param("user") User user);

}
