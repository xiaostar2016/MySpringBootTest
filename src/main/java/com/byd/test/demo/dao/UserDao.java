package com.byd.test.demo.dao;

import com.byd.test.demo.model.UserBean;

import java.util.List;

public interface UserDao {
    int insert(UserBean userBean);

    List<UserBean> queryUserBean();
}
