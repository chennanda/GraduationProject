package com.demo1.controller;

import com.demo1.services.impl.UserLoginImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/5
 */
@RestController
@RequestMapping("/Graduation/menu")
public class homePageController {

    @GetMapping("/home")
    public String homePage(){
        System.out.println(UserLoginImpl.sessionMap.entrySet());
        return "登录成功，这是首页!";
    }

}
