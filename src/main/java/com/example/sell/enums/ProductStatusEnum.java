package com.example.sell.enums;

import lombok.Getter;

/**
 * @Description 商品状态
 * @auther lfx
 * @date 2019/3/9 17:05
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
