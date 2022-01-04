package com.example.demo1.controller;

import com.example.demo1.entity.UserLogin;
import com.example.demo1.services.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */
@RestController
@RequestMapping("/Graduation")
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    /**
     * 用户登录
     * @return
     */
    @PostMapping("/login")
    public String UserLogin(@RequestBody UserLogin userLogin){

        List<UserLogin> a = userLoginService.selectBaseFieldResultMap();

        for (UserLogin f :
                a) {
            boolean userBool = Objects.equals(userLogin.getUserName(), f.getUserName());
            if (userBool){
                boolean pwdBool = Objects.equals(userLogin.getPassword(), f.getPassword());
                return pwdBool ? "登录成功！" : "密码错误。请重新输入！";
            }
        }
        return "账号未注册！";

    }

}
