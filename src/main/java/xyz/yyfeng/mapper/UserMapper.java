package xyz.yyfeng.mapper;

import xyz.yyfeng.po.Message;
import xyz.yyfeng.po.Start;
import xyz.yyfeng.po.User;

import java.util.List;

public interface UserMapper{
    public User Find(String Stdid);
    public List<User> Firsts(String name);
    public List<Start> getStarts(String Stuid);
    public Start slStart(Start start);
    public  void setStart(Start start);
    public List<Message> showmessage(String Stuid);
    public void setmessage(Message message);
    public Integer updateinfo(User user);
    public void updateps(String Stuid,String newps);

}
