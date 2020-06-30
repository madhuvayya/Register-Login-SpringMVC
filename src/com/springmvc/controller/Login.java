package com.springmvc.controller;

import com.springmvc.model.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {

    @RequestMapping("/login-page")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        if(userDao.login(email, password)) {
            return new ModelAndView("welcome","message", "Successfully logged in..");
        }
        return new ModelAndView("login","message", "Enter correct details");
    }

}
