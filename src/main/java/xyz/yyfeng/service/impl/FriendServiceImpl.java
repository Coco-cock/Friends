package xyz.yyfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.yyfeng.mapper.FriendMapper;
import xyz.yyfeng.po.Searchuser;
import xyz.yyfeng.service.FriendService;

import java.util.List;

public class FriendServiceImpl implements FriendService{

    @Autowired
    FriendMapper friendMapper;
    @Override
    public List<Searchuser> searchfriends(String sname) {
        return friendMapper.searchfriends(sname);
    }
}
