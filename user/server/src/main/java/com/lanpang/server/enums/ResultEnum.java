package com.zly.user.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    LOGIN_FAIL(1, "登陆失败"),
    ERROR_ROLE(2, "权限不对")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
