package xyz.yyfeng.controller;


import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.Message;
import xyz.yyfeng.po.Start;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.UserService;

import javax.annotation.Resource;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {
    @Resource(name = "id")
    private UserService userService;

    @RequestMapping(value = "/user")
    public String home(Model model,HttpSession session){
        User user = (User)session.getAttribute("user");
        model.addAttribute("user",user);
        return "User";
    }
    @RequestMapping(value = "/reviseuser")
    public String reviseUser(){
        return null;
    }

    @RequestMapping("/revisepasswd")
    public String revisepasswd(){

        return null;
    }
    @RequestMapping(value = "/about")
    public String About(HttpServletRequest request, Model model){

        String agent=request.getHeader("User-Agent");
        UserAgent userAgent = UserAgent.parseUserAgentString(agent);
        Browser browser = userAgent.getBrowser();
        OperatingSystem operatingSystem = userAgent.getOperatingSystem();
        model.addAttribute("Bname",browser.getName());
        model.addAttribute("BGroup",browser.getGroup());
        model.addAttribute("Bversion",userAgent.getBrowserVersion());
        model.addAttribute("OSname",operatingSystem.getName());
        model.addAttribute("OSType",operatingSystem.getDeviceType());
        model.addAttribute("OSFa",operatingSystem.getManufacturer());
        return "about";
    }
    @RequestMapping(value = "/start",method =RequestMethod.GET)
    public String getStart(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        List<Start> startlist = userService.getStarts(user.getStuid());
        model.addAttribute("startlist",startlist);

            return "start";
    }
    @RequestMapping(value = "/setstart",method = RequestMethod.POST)
    public @ResponseBody Map setstart(HttpSession session, HttpServletRequest request){
        Map<String, Object> rufelt = new HashMap<String, Object>();
        User user= (User) session.getAttribute("user");
        String meid = user.getStuid();
        String fromid = request.getParameter("fromid");
        Start start = new Start();
        start.setStuid(meid);
        start.setFromid(fromid);

        Start start1 = userService.sclStatr(start);
        if (start1!=null){
            rufelt.put("error",1);
        }else {
            userService.setStart(start);
            rufelt.put("error",0);
        }
        return rufelt;
    }
    @RequestMapping(value = "/message",method = RequestMethod.GET)

        public String showmessage(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        List<Message> messages= userService.showmessage(user.getStuid());
        model.addAttribute("messages",messages);
        return "message";
    }
    @RequestMapping(value = "/setmessage",method = RequestMethod.POST)
    public @ResponseBody Map setmessage(HttpServletRequest request,HttpSession session){
        Map<String, Object> rufelt = new HashMap<String, Object>();
        User user = (User) session.getAttribute("user");
        Message message = new Message();
        message.setStuid(user.getStuid());
        message.setFromid(request.getParameter("fromid"));
        message.setContent(request.getParameter("content"));
        userService.setmessage(message);
        rufelt.put("error",0);
        return rufelt;
    }
    @RequestMapping(value = "/user/updateinfo",method = RequestMethod.GET)
    public String updateinfo(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        model.addAttribute("user",user);

        return "updateinfo";

    }
    @RequestMapping(value = "/setinfo",method = RequestMethod.POST)
    public @ResponseBody Map setinfo(User user,HttpSession session){
        Map<String, Object> rufelt = new HashMap<String, Object>();
        User me = (User) session.getAttribute("user");
        String stuid =me.getStuid();
        user.setStuid(stuid);
       Integer integer =  userService.updateinfo(user);
           rufelt.put("error",0);
           session.setAttribute("user",userService.FindUser(stuid));
        return rufelt;
    }
    @RequestMapping(value = "/user/updatepasswd",method = RequestMethod.GET)
    public String showpasswd(){
        return "updatepasswd";
    }


    @RequestMapping(value = "/updateps",method = RequestMethod.POST)
    public @ResponseBody Map updatepasswd(HttpSession session,HttpServletRequest request){
        Map<String, Object> rufelt = new HashMap<String, Object>();
        User user = (User) session.getAttribute("user");
        String old = request.getParameter("oldps");
        String newps = request.getParameter("newps");
        if (!user.getPasswd().equals(old)){
            rufelt.put("error",1);
        }else {
            userService.updateps(user.getStuid(),newps);
            rufelt.put("error",0);
        }
        return rufelt;
    }

}
