package xyz.yyfeng.Test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.Fineid;
import xyz.yyfeng.service.Sigin;

import javax.annotation.Resource;



public class TestBean {


    private ApplicationContext applicationContext;

    @Before
    public void setUP() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/spring.xml");

    }
    @Autowired
    private Sigin sigin;
    @Test
    public void Beab() {
        sigin.adduser();

    }
}
