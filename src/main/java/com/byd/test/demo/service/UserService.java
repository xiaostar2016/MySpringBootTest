package com.byd.test.demo.service;

import com.byd.test.demo.model.UserBean;
import com.github.pagehelper.PageInfo;

public interface UserService {
    int addUser(UserBean user);

    PageInfo<UserBean> findAllUser(int pageNum, int pageSize);
}
