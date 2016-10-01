package com.springapp.dao.impl;

import com.springapp.dao.IUserDao;
import com.springapp.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Title:
 * Description:
 * Create Time: 2016/6/21 0021 23:19
 *
 * @author: YEEQiang
 * @version: 1.0
 */
@Repository(value = "userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public void sayHello(User user) {
        System.out.println(user.getUserName() + " : " + user.getAge());
    }
}
