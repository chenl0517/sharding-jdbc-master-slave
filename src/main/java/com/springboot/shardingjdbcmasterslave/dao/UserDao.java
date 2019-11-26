package com.springboot.shardingjdbcmasterslave.dao;

import com.springboot.shardingjdbcmasterslave.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {

    Long addUser(User user);

    List<User> list();
}
