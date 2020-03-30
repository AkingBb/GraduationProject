package com.lyq.edu.service;

public interface UserService {
    //管理员登录验证
    int adminLoginCheck(String username, String password);

    //教师登录验证
    int teacherLoginCheck(String username, String password);
}
