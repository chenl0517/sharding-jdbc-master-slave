package com.springboot.shardingjdbcmasterslave.service.impl;

import com.springboot.shardingjdbcmasterslave.dao.UserDao;
import com.springboot.shardingjdbcmasterslave.domain.User;
import com.springboot.shardingjdbcmasterslave.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public Long addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
