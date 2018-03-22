package xyz.yyfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.yyfeng.mapper.UserMapper;
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
}
