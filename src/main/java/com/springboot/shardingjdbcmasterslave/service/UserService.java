package com.springboot.shardingjdbcmasterslave.service;

import com.springboot.shardingjdbcmasterslave.domain.User;

import java.util.List;

public interface UserService {

    Long addUser(User user);

    List<User> list();
}
