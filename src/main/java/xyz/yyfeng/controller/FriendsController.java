package xyz.yyfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.UserService;

import javax.annotation.Resource;

@Controller
public class FriendsController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "friend/{Stuid}",method = RequestMethod.GET)
    public String Frined(@PathVariable("Stuid") String Stuid , Model model){
        User user = userService.FindUser(Stuid);
        model.addAttribute("friend",user);

        return "friend";
    }
}
