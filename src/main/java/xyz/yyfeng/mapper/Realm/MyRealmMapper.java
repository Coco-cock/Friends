package xyz.yyfeng.mapper.Realm;

import xyz.yyfeng.po.User;

public interface MyRealmMapper {
    User findUserByUsername(String userName);
}
