package com.example.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Description
 * @auther lfx
 * @date 2019/3/19 21:49
 */
@Data
public class OrderForm {

    //买家姓名
    @NotEmpty(message = "姓名必填")
    private String name;

    //买家手机号
    @NotEmpty(message = "手机号必填")
    private String phone;

    //买家地址
    @NotEmpty(message = "地址必填")
    private String address;

    //买家openId
    @NotEmpty(message = "openId必填")
    private String openid;

    //
    @NotEmpty(message = "购物车不能为空")
    private String items;


}
