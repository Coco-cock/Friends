package xyz.yyfeng.Test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.yyfeng.mapper.FriendMapper;
import xyz.yyfeng.mapper.UserMapper;
import xyz.yyfeng.po.Searchuser;
import xyz.yyfeng.po.User;



public class TestUser {

    private ApplicationContext applicationContext;
    @Before
    public void setUP() throws Exception{
        applicationContext =new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");

    }
    @Test
    public void selectUserinfo() {
        FriendMapper friendMapper = (FriendMapper)applicationContext.getBean("friendMapper");
        Searchuser searchuser = (Searchuser) friendMapper.searchfriends("李");
        System.out.print(searchuser.getStuid());


    }



}
