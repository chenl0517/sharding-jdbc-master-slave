package com.springboot.shardingjdbcmasterslave.controller;

import com.springboot.shardingjdbcmasterslave.domain.User;
import com.springboot.shardingjdbcmasterslave.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserContro {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public Object list() {
        return userService.list();
    }

    @RequestMapping("/list")
    public Object addUser(@RequestParam Integer id, @RequestParam String username, @RequestParam String password) {
        /*分表，分库分表*/
//        for (int i = 100; i < 150; i++) {
//            User user = User.builder()
//                    .id(i)
//                    .username(username + i)
//                    .password(password)
//                    .build();
//            long resutl = userService.addUser(user);
//            log.info("insert:" + user.toString() + " result:" + resutl);
//        }
        /*读写分离*/
            User user = User.builder()
                    .id(id)
                    .username(username)
                    .password(password)
                    .build();
            userService.addUser(user);
        return "ok";
    }

}
