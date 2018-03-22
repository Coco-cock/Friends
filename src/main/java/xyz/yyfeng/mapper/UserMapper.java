package xyz.yyfeng.mapper;

import xyz.yyfeng.po.User;

import java.util.List;

public interface UserMapper{
    public User Find(String Stdid);
    public List<User> Firsts(String name);

}
