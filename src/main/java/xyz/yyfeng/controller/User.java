package xyz.yyfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {
    @RequestMapping(value = "/user")
    public String home(){
        return "User";
    }
}
