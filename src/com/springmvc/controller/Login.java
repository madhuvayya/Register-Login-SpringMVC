package com.springmvc.controller;

import com.springmvc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@SessionAttributes({"email"})
public class Login {

    @RequestMapping("/login-page")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) throws ServletException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        if(userDao.login(email, password)) {
            model.addAttribute("message","You successfully logged in...");
            session.setAttribute("email",email);
            return "redirect:/welcome";
        }
        model.addAttribute("message","Enter Correct details...");
        return  "login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
