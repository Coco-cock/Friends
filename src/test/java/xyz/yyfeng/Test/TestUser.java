package xyz.yyfeng.Test;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yyfeng.mapper.UserMapper;
import xyz.yyfeng.po.User;



public class TestUser {

    private ApplicationContext applicationContext;
    private static final Log log= LogFactory.getLog("logname");
    @Before
    public void setUP() throws Exception{
        applicationContext =new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");

    }
    @Test
    public void selectUserinfo() {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.First(1);
        System.out.print(user.toString());


    }


}
