package com.example.sell.dto;

import lombok.Data;

/**
 * @Description 购物车
 * @auther lfx
 * @date 2019/3/14 22:43
 */
@Data
public class CartDTO {

    /** 商品id **/
    private String productId;

    /** 商品数量 **/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
