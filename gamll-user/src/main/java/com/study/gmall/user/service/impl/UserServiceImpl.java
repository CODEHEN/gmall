package com.study.gmall.user.service.impl;

import com.study.gmall.user.bean.UserMember;
import com.study.gmall.user.mapper.UserMapper;
import com.study.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: CHENLH
 * @Description:
 * @Date: Create in 17:50 2020/5/7
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
