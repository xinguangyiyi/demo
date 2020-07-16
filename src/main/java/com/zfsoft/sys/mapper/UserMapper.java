package com.zfsoft.sys.mapper;

import com.zfsoft.sys.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName YY
 * @Description:
 * @Author wuxx
 * @Date 2020/2/27
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> selectUser();
}