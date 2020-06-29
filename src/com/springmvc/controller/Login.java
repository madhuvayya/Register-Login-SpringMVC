package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

    @RequestMapping("/login-page")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("message","Successfully Registered");
        return "welcome";
    }
}