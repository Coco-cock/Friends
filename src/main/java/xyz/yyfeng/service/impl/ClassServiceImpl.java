package xyz.yyfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.yyfeng.mapper.ClassMapper;
import xyz.yyfeng.po.User;
import xyz.yyfeng.service.ClassService;

import javax.annotation.Resource;
import java.util.List;

public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;
    @Override
    public List<User> classfriend(String classid) {
        return classMapper.classmate(classid);
    }
}
