package xyz.yyfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import xyz.yyfeng.mapper.UserMapper;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.Fineid;

import javax.annotation.Resource;

public class FineidImpl implements Fineid {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User Fine(int id) {
        return userMapper.First(id);
    }
}
