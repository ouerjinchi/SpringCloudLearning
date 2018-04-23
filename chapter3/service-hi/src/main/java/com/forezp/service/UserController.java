package com.forezp.service;


import com.forezp.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User findUser(@PathVariable("userId") Integer userId) {
        return new User("张三历史", userId);
    }
}
