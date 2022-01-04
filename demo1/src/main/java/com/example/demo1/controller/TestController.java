package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */
@RestController
@RequestMapping("/Graduation")
public class TestController {

    @GetMapping("/initTest")
    public String initTest(){
        return "初始化成功";
    }

}
