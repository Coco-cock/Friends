package xyz.yyfeng.service;

import xyz.yyfeng.po.User;

import java.util.List;

public interface UserService {

    public User FindUser(String Stuid);
    public List<User> Fines(String name);
}
