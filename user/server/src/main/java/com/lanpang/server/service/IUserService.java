package com.zly.user.service;

import com.zly.user.entity.UserInfo;

public interface IUserService {

    public UserInfo findUserByOpenid(String uid);

}
