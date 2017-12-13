package xyz.yyfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Wecome {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        return "hello";

    }
}
