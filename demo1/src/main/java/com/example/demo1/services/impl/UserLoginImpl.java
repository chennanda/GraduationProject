package com.example.demo1.services.impl;

import com.example.demo1.entity.UserLogin;
import com.example.demo1.mapper.UserLoginMapper;
import com.example.demo1.services.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */

@Service
public class UserLoginImpl implements UserLoginService {

    @Autowired
    UserLoginMapper userLoginMapper;

    @Override
    public List<UserLogin> selectBaseFieldResultMap() {
        List<UserLogin> a = userLoginMapper.selectBaseFieldResultMap();
        return a;
    }
}
