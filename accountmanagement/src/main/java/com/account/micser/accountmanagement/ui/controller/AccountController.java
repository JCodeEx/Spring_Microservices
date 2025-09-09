package com.account.micser.accountmanagement.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")

public class AccountController {
    @GetMapping("/status/account")
    public String status() {
        return "Account management service is up and running";
    }
}
