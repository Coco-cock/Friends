package xyz.yyfeng.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UsersController {
    @Resource(name = "id")
    private UserService fineid;

    @RequestMapping(value = "/user")
    public String home(Model model,HttpSession session){
        User user = (User)session.getAttribute("user");
        model.addAttribute("user",user);
        return "User";
    }
}
