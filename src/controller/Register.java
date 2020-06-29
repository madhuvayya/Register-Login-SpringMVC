package controller;

import model.User;
import model.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


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

    @RequestMapping("/register")
    public void register(@ModelAttribute("user")User user){
        UserDao userDao = new UserDao();
        userDao.register(user);
    }

}
