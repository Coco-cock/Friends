package xyz.yyfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.Fineid;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Test {
    @Resource(name = "id")
    private Fineid id;


    @RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
    public @ResponseBody
    List <User> test(@PathVariable("name") String name){
        List<User> user = id.Fines(name);
        return user;
    }
}
