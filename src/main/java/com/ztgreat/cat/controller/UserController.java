package com.ztgreat.cat.controller;

import com.ztgreat.cat.entity.User;
import com.ztgreat.cat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    private User queryUserById() {
        return  userService.queryUserById(10);
    }
}
