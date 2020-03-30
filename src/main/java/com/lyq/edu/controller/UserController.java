package com.lyq.edu.controller;

import com.lyq.edu.entity.User;
import com.lyq.edu.service.UserService;
import com.lyq.edu.util.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(name = "登录")
    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, @RequestParam("username") String username, @RequestParam("password") String password) throws IOException {
        PrintWriter out = response.getWriter();
        out.flush();
        ModelAndView mv = new ModelAndView();
        int result = userService.adminLoginCheck(username,password);
        //若result为3则该用户为管理员，若为0则用户不存在，继续判断该用户是否为教师
        if(result == 3) {

        }else {
            result = userService.teacherLoginCheck(username,password);
            //若result为2则该用户为教师，反之则用户名或密码错误，跳转到 login.jsp页面重新登录
            if(result == 1) {

            }else {
                out.print("<script>alert('用户名或密码错误！');</script>");
                mv.setViewName("login");
                return mv;
            }
        }
        return mv;
    }

}
