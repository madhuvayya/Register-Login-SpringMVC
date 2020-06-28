package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/register")
    public void register(){
        //return ;
    }

}
