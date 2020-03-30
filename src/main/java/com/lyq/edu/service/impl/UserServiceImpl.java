package com.lyq.edu.service.impl;

import com.lyq.edu.dao.UserMapper;
import com.lyq.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int adminLoginCheck(String username, String password) {
        return userMapper.adminLoginCheck(username,password);
    }

    @Override
    public int teacherLoginCheck(String username, String password) {
        return userMapper.teacherLoginCheck(username,password);
    }
}
