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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Register {


    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/register-page")
    public String getRegisterPage(){
        return "register";
    }

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public ModelAndView register(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user")User user){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.register(user);
        return new ModelAndView("login","message","Successfully Registered");
    }

}
