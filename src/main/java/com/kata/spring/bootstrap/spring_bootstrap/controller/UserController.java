package com.kata.spring.bootstrap.spring_bootstrap.controller;


import com.kata.spring.bootstrap.spring_bootstrap.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String userInfo(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user",user);
        model.addAttribute("roles",user.getRoles());
        return "user-page";
    }

}