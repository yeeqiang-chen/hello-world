package com.springapp.service.impl;

import com.springapp.dao.IUserDao;
import com.springapp.pojo.User;
import com.springapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title:
 * Description:
 * Create Time: 2016/6/21 0021 23:23
 *
 * @author: YEEQiang
 * @version: 1.0
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public void hello(User user) {
        this.userDao.sayHello(user);
    }
}
