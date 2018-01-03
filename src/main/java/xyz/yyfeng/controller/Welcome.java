package xyz.yyfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import xyz.yyfeng.mapper.UserMapper;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.Fineid;

import javax.annotation.Resource;

@Controller
public class Welcome {

   @Resource(name = "id")
   private Fineid id;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView Hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",id.Fine(1));
        modelAndView.setViewName("hello");
        return modelAndView;

    }
}
