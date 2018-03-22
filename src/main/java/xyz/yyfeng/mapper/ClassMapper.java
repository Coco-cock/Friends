package xyz.yyfeng.mapper;

import xyz.yyfeng.po.User;

import java.util.List;

public interface ClassMapper {
    public List<User> classmate(String classId);
}
