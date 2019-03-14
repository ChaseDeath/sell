package com.example.sell.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @Description TODO
 * @auther lfx
 * @date 2019/3/14 21:53
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
