package com.zly.user.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class UserInfo {

    @Id
    private String id;
    private String username;
    private String password;
    private String openid;
    private Long role;
    private Date createTime;
    private Date updateTime;

}
