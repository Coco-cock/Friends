package xyz.yyfeng.controller;




import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.Fineid;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class Login {
    @Resource(name = "id")
    private Fineid fineid;

    @RequestMapping(value = "/")
    public String home(){

        return "redirect:/user";
    }

    @RequestMapping(value = "/login")
    public  String login() throws Exception {
            return "login";

    }
    @RequestMapping(value = "/loginVerify",method = RequestMethod.POST)

    public @ResponseBody Map loginVerify(HttpSession session, HttpServletRequest request,
                              HttpServletResponse response)throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        String StudentID = request.getParameter("userid");
        String password  = request.getParameter("password");
        String verifyCode = request.getParameter("verifyCode");
        System.out.print(StudentID);
//
        User user = fineid.Fine(StudentID);
        if (user==null){
            map.put("code",0);
            map.put("msg","用户不存在");
        }else if (!user.getPasswd().equals(password)){
            map.put("code",0);
            map.put("msg","密码错误");
        }else if (!session.getAttribute("verifyCode").equals(verifyCode)){
            map.put("code",0);
            map.put("msg","验证码错误");
        }
        else {
            session.setAttribute("user",user.getName());
            map.put("code",1);
            map.put("msg","登陆成功");
        }
        return map;


    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session) throws Exception{
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/login";
    }
}