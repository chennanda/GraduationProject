package com.demo1.controller;

import com.demo1.util.JsonData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */
@RestController
@RequestMapping("/Graduation/Test")
public class TestController {

    @Value("${c.id}")
    private String cid;

    @GetMapping("/initTest")
    public JsonData initTest(){
        return JsonData.buildSuccess(cid);
    }


}
