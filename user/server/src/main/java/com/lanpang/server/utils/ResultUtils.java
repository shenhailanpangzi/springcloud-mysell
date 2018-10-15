package com.zly.user.utils;


import com.zly.user.entity.ResultVO;
import com.zly.user.enums.ResultEnum;

public class ResultUtils {

    public static ResultVO success(Object data) {
        ResultVO<Object> resultDTO = new ResultVO<>();
        resultDTO.setCode(0);
        resultDTO.setMsg("成功");
        resultDTO.setData(data);
        return resultDTO;
    }

    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO<Object> resultDTO = new ResultVO<>();
        resultDTO.setCode(resultEnum.getCode());
        resultDTO.setMsg(resultEnum.getMsg());
        return resultDTO;
    }

}
