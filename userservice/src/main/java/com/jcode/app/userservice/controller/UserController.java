package com.jcode.app.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {
    @GetMapping("/userinfo")
    public String getUserInfo() {
        return "User Info from User Service";
    }

}
