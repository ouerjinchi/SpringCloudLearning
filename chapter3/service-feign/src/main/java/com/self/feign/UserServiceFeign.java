package com.self.feign;


import com.forezp.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface UserServiceFeign {

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    User findByGroupId(@PathVariable("userId") Integer userId) ;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.PUT)
    void update(@PathVariable("userId") Integer groupId, @RequestParam("name") String name);
}
