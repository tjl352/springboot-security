package com.example.springbootsecurity.controllers;

import com.sun.istack.internal.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    Logger logger = Logger.getLogger(LoginController.class);

    @GetMapping("/")
    public String home(){
        logger.info("home() called");
        return "<h1>This is home</h1>";
    }

    @GetMapping("/user")
    public String user(){
        logger.info("user() called");
        return "<h1>This is user</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        logger.info("admin() called");
        return "<h1>This is admin</h1>";
    }
}
