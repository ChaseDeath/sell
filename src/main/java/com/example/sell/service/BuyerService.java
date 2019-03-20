package com.example.sell.service;

import com.example.sell.dto.OrderDTO;

/**
 * @Description
 * @auther lfx
 * @date 2019/3/20 15:30
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);
}
