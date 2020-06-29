package com.springmvc.controller;

import com.springmvc.model.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        if(userDao.login(email, password)) {
            return "welcome";
        }
        modelMap.addAttribute("message", "Invalid Credentials");
        return "login";
    }


}
