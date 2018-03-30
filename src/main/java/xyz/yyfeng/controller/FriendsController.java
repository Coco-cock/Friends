package xyz.yyfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.Searchuser;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.ClassService;
import xyz.yyfeng.service.FriendService;
import xyz.yyfeng.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FriendsController {

    @Resource
    private UserService userService;

    @Resource(name = "friend")
    private FriendService friendService;


    @RequestMapping(value = "friend/{Stuid}",method = RequestMethod.GET)
    public String Frined(@PathVariable("Stuid") String Stuid , Model model){
        User user = userService.FindUser(Stuid);
        if(user==null){
            return "404";
        }else {
            model.addAttribute("friend", user);
            return "friend";
        }
    }
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search(){
        return "search";

    }


    @RequestMapping(value ="/searchfriend",method = RequestMethod.POST)
    public @ResponseBody Map searchfriend(HttpServletRequest request){

        Map<String, Object> rufelt = new HashMap<String, Object>();
        String name = request.getParameter("name");

        List<Searchuser> userlist = friendService.searchfriends(name);
        if (userlist.isEmpty()){
            rufelt.put("error",1);

        }else {
            rufelt.put("error",0);
            rufelt.put("data",userlist);
        }

        return rufelt;
    }
}
