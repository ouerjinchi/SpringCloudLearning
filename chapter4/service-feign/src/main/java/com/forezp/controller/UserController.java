package com.forezp.controller;

import com.forezp.entity.User;
import com.forezp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User findUser(@PathVariable("userId") Integer userId) {
     return   this.service.findUser(userId);

    }
}
