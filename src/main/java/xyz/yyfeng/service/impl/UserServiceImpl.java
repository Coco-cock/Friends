package xyz.yyfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.yyfeng.mapper.UserMapper;
import xyz.yyfeng.po.Message;
import xyz.yyfeng.po.Start;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User FindUser(String Stuid) {
        return userMapper.Find(Stuid);
    }

    @Override
    public List<User> Fines(String name) {
        return userMapper.Firsts(name);
    }

    @Override
    public List<Start> getStarts(String Stuid) {
        return userMapper.getStarts(Stuid);
    }

    @Override
    public Start sclStatr(Start start) {
        return userMapper.slStart(start);
    }

    @Override
    public List<Message> showmessage(String Stuid) {
        return  userMapper.showmessage(Stuid);
    }

    @Override
    public void setStart(Start start) {
        userMapper.setStart(start);

    }

    @Override
    public void setmessage(Message message) {
        userMapper.setmessage(message);
    }

    @Override
    public Integer updateinfo(User user) {
        return userMapper.updateinfo(user);
    }

    @Override
    public void updateps(String Stuid, String newps) {
        userMapper.updateps(Stuid,newps);
    }
}
