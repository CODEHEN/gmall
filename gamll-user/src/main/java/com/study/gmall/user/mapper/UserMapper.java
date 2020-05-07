package com.study.gmall.user.mapper;

import com.study.gmall.user.bean.UserMember;

import java.util.List;

/**
 * @Author: CHENLH
 * @Description:
 * @Date: Create in 17:52 2020/5/7
 */
public interface UserMapper {
    List<UserMember> selectAllUser();
}
