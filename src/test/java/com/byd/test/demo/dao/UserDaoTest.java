package com.byd.test.demo.dao;

import com.byd.test.demo.model.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void insert() {
        UserBean userBean = new UserBean();
        userBean.setUserName("我的测试");
        userBean.setUserPassword("123456");
        userBean.setUserPhone("1666666666");
        int insert = userDao.insert(userBean);
        assertEquals(insert, 1);
    }

    @Test
    public void queryUserBean() {
        List<UserBean> userBeans = userDao.queryUserBean();
        assertEquals(5, userBeans.size());
    }
}