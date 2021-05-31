package com.lemon.api;

import com.lemon.pojo.Result;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public Result register(String username,String password){
        if (username==null || username.trim().length()==0){
            return new Result("0","用户名不能为空");
        }
        if (password==null || password.trim().length()==0){
            return new Result("0","密码不能为空");
        }
        if ("nickjiang".equals(username)){
            return new Result("0","账号已注册");
        }
        return new Result("1","注册成功");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(String username,String password){
        if (username==null || username.trim().length()==0){
            return new Result("0","用户名不能为空");
        }
        if (password==null || password.trim().length()==0){
            return new Result("0","密码不能为空");
        }
        if ("nickjiang".equals(username)&&"123456".equals(password)) {
            return new Result("1", "登录成功");
        }else {
            return new Result("0","登录失败");
        }

    }

    @RequestMapping(value = "/resetPassword",method = RequestMethod.POST,consumes = "application/json")
    public Result resetPassword(@RequestBody(required = false) User user){
        String username = null;
        String password = null;
        if (user!=null){
            username = user.getUsername();
            password = user.getPassword();
        }

        if (username==null || username.trim().length()==0){
            return new Result("0","用户名不能为空");
        }
        if (password==null || password.trim().length()==0){
            return new Result("0","密码不能为空");
        }
        if ("nickjiang".equals(username)&&"123456".equals(password)) {
            return new Result("1", "登录成功");
        }else {
            return new Result("0","登录失败");
        }

    }






}
