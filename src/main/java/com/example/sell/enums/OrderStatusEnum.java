package com.example.sell.enums;

import lombok.Getter;

/**
 * @Description TODO
 * @auther lfx
 * @date 2019/3/14 15:47
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新下单"),
    FINISH(1, "完结"),
    CANCEL(2, "已取消")
    ;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
