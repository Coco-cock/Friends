package xyz.yyfeng.controller;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class Login {

    @RequestMapping(value = "/login")
    public  String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
            String Studentid = request.getParameter("inputid");
            String Passwd = request.getParameter("passwd");
            String codeid = request.getParameter("codeid");


            return "login";

    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session) throws Exception{
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/login";
    }
}