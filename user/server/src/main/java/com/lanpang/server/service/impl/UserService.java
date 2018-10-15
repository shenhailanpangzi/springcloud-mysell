package com.zly.user.service.impl;

import com.zly.user.dao.UserDao;
import com.zly.user.entity.UserInfo;
import com.zly.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserInfo findUserByOpenid(String uid) {
        return userDao.findByOpenid(uid);
    }
}
