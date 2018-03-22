package xyz.yyfeng.controller;


import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.ClassService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class ClassController {
    @Resource(name = "class")
    private ClassService service;

    @RequestMapping(value = "/classlist" , method = RequestMethod.GET)
    public String classlist(Model model, HttpSession session){

        User user = (User) session.getAttribute("user");
        List <User> classmates = service.classfriend(user.getClassId());
        model.addAttribute("classmates",classmates);


        return "classfriends";
    }
}
