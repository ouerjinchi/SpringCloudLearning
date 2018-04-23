package com.forezp.service;

import com.forezp.entity.User;
import com.forezp.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserServiceFeign service; // 远程服务

    public User findUser(Integer userId) {
        return service.findByGroupId(userId); // 通过HTTP调用远程服务
    }
}
