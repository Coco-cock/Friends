package xyz.yyfeng.service;

import xyz.yyfeng.po.User;

import java.util.List;

public interface Fineid {

    public User Fine(String name);
    public List<User> Fines(String name);
}
