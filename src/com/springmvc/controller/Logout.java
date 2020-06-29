package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logout {

    @RequestMapping("/logout")
    public ModelAndView loginPage(){
        return new ModelAndView("home","message","You successfully logged out.");
    }
}
