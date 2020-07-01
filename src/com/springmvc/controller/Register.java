package com.springmvc.controller;

import com.springmvc.model.User;
import com.springmvc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;
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
    public ModelAndView register(@ModelAttribute("user")User user){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        try {
            userDao.register(user);
        } catch (DuplicateKeyException exception) {
            return new ModelAndView("login","message","You already registered");
        }
        return new ModelAndView("login","message","Successfully Registered");
    }

}
