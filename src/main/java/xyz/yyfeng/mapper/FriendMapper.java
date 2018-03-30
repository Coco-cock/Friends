package xyz.yyfeng.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import xyz.yyfeng.po.Searchuser;
public interface FriendMapper {
    public List<Searchuser> searchfriends(@Param("sname") String sname);
}
