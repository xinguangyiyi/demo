package com.zfsoft.sys.service;

import com.zfsoft.sys.dao.UserDao;
import com.zfsoft.sys.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    public User findUserById(int id) {
        User user = userdao.findUserById(id);
        return user;
    }

}