package xyz.yyfeng.service;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.yyfeng.mapper.UserMapper;
import xyz.yyfeng.po.User;

public class SelectIDImpl implements SelectID {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User Fine(int id) {
        return userMapper.First(id);
    }
}
