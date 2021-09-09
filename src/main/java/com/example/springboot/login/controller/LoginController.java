package com.example.springboot.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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

    @GetMapping("home")
    public String home(HttpServletResponse response){
        setDummyCookie(response);
        return "home";
    }

    private void setDummyCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("dummyCookie", "dummy_cookie");
        cookie.setMaxAge(2592000);
        cookie.setPath("/");
        response.addCookie(cookie);
    }
}
