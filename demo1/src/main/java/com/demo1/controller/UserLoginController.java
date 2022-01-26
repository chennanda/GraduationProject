package com.demo1.controller;

import com.demo1.services.UserLoginService;
import com.demo1.entity.UserLogin;
import com.demo1.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */
@RestController
@RequestMapping("")
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    /**
     * 用户登录
     *
     * @return
     */

    @RequestMapping("/GraduationLogin")
    public JsonData UserLogin(@RequestBody UserLogin userLogin) {

        String token = userLoginService.login(userLogin.getUserName(), userLogin.getPassword());

        return token != null ? JsonData.buildSuccess(token) : JsonData.buildError("账号密码错误");

    }

}
