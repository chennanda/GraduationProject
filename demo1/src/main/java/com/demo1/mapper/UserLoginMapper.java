package com.demo1.mapper;

import com.demo1.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2022/1/4
 */

@Mapper
public interface UserLoginMapper {
    List<UserLogin> selectBaseFieldResultMap();
}
