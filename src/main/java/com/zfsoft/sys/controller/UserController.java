package com.zfsoft.sys.controller;

import com.zfsoft.sys.mapper.UserMapper;
import com.zfsoft.sys.pojo.User;
import com.zfsoft.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName T
 * @Description:131
 * @Author wuxx
 * @Date 2020/2/27
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public User find () {
        User user = userService.findUserById(2);
        System.out.print(user);
        return user;//返回的是json格式的数据
    }

}