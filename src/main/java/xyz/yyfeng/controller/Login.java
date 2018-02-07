package xyz.yyfeng.controller;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.yyfeng.po.User;


@Controller
public class Login {

    @RequestMapping(value = "/login")
    public String login(User user, Model model) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPasswd());
        try {
            subject.login(token);
            return "redirect:/admin";
        } catch (Exception e) {
//          e.printStackTrace();
            model.addAttribute("error", "用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping(value = "/admin")
    public String admin(){
        return "admin";
    }


    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(Model model){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        model.addAttribute("msg","您已经退出登录");
        return "login";
    }
}