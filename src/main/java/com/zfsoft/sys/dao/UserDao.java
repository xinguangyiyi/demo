package com.zfsoft.sys.dao;

import com.zfsoft.sys.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Dao接口
 * */
@Mapper
public interface UserDao {

    User findUserById(int id);

}