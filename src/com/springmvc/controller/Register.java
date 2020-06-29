package com.springmvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springmvc.model.User;
import com.springmvc.model.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Register {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/register-page")
    public String getRegisterPage(){
        return "register";
    }

    @RequestMapping("/register")
    public void register(HttpServletRequest request,HttpServletResponse response, @ModelAttribute("user")User user){
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.register(user);
    }

}
