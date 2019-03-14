package com.example.sell.exception;

import com.example.sell.enums.ResultEnum;

/**
 * @Description sell中遇到的exception
 * @auther lfx
 * @date 2019/3/14 21:51
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
