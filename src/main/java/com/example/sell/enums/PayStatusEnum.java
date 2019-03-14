package com.example.sell.enums;

import lombok.Getter;

/**
 * @Description TODO
 * @auther lfx
 * @date 2019/3/14 15:53
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功")
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
