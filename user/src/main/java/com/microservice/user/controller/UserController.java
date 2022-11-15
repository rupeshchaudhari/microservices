package com.microservice.user.controller;

import com.microservice.user.VO.ResponseTemplateVO;
import com.microservice.user.entity.User;
import com.microservice.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        log.info("Inside the save User of User Controller");
        return userService.saveUser(user);
    }

//    @GetMapping("/{id}")
//    public User getUser(@PathVariable("id") Long id){
//        log.info("Inside the get User of User Controller");
//        return  userService.getUserById(id);
//    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userId){
        log.info("Inside the get UserWithDepartment of User Controller");
        return userService.getUserWithDepartment(userId);

    }
}
