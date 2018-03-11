package xyz.yyfeng.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.yyfeng.service.Fineid;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class Users {
    @Resource(name = "id")
    private Fineid fineid;

    @RequestMapping(value = "/user")
    public String home(Model model,HttpSession session){
        return "User";
    }
}
