package com.zly.user.dao;

import com.zly.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserInfo, Long> {

    UserInfo findByOpenid(String openid);

    UserInfo findByUsernameAndPassword(String username, String password);

}
