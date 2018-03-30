package xyz.yyfeng.service;

import xyz.yyfeng.po.Message;
import xyz.yyfeng.po.Start;
import xyz.yyfeng.po.User;

import java.util.List;

public interface UserService {

    public User FindUser(String Stuid);
    public List<User> Fines(String name);
    public List<Start> getStarts(String Stuid);
    public Start sclStatr(Start start);
    public void setStart(Start start);
    public List<Message>showmessage(String Stuid);
    public void setmessage(Message message);
}
