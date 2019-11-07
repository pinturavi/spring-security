package com.pintu.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "home.jsp";
    }

    @GetMapping("/home")
    public String getHomePage2() {
        return "home.jsp";
    }

    @GetMapping("/login")
    public String login(){
        return "login.jsp";
    }

    @GetMapping("/logoutsuccess")
    public String logout(){
        return "logout.jsp";
    }

}
