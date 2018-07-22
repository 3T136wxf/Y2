package com.sz.mapper;

import com.sz.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int findUserAll(@Param("user") User user);

}
