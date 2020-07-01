package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class Logout {

    @RequestMapping("/logout")
    public ModelAndView logoutPage(HttpSession session){
        session.removeAttribute("email");
        session.invalidate();
        return new ModelAndView("home","message","You successfully logged out.");
    }
}
