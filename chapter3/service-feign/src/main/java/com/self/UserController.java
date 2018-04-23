package com.self;

import com.forezp.entity.User;
import com.forezp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping("/hello")
    public User findUser() {
     return   this.service.findUser(1);

    }
}
