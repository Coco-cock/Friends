package xyz.yyfeng.mapper;

import xyz.yyfeng.po.User;

import java.util.List;

public interface UserMapper{
    public User First(String name);
    public List<User> Firsts(String name);

}
