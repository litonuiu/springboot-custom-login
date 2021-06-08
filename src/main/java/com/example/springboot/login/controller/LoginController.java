package com.example.springboot.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Md. Liton Miah
 * @Date 6/8/2021
 */

@Controller
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "login";
    }
}
