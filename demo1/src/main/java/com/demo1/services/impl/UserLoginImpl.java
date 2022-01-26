package com.demo1.services.impl;

import com.demo1.services.UserLoginService;
import com.demo1.entity.UserLogin;
import com.demo1.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */

@Service
public class UserLoginImpl implements UserLoginService {

    public static Map<String, UserLogin> sessionMap = new HashMap<>();
    public static Map<String, UserLogin> userMap = new HashMap<>();

    @Autowired
    UserLoginMapper userLoginMapper;

    @Override
    public String login(String username, String password) {
        List<UserLogin> a = userLoginMapper.selectBaseFieldResultMap();

        for (UserLogin f :
                a) {
            userMap.put(f.getUserName(), f);
        }
        System.out.println(userMap.toString());
        //  {mdy=UserLogin(id=1, userName=mdy, password=mdy), cnd=UserLogin(id=0, userName=cnd, password=cnd)}

        UserLogin ul1 = userMap.get(username);

        if (ul1 == null) {
            return null;
        } else if (ul1.getPassword().equals(password)) {
            String token = UUID.randomUUID().toString();
            //sessionMap.clear();
            sessionMap.put(token, ul1);
            //System.out.println(sessionMap);
            return token;
        } else {
            return null;
        }
    }
}