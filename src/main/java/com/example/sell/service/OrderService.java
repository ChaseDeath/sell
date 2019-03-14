package com.example.sell.service;

import com.example.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Description 订单service接口
 * @auther lfx
 * @date 2019/3/14 21:00
 */
public interface OrderService {

    /** 创建订单 **/
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 根据订单id查询单个订单
     * @param orderId
     * @return
     */
    OrderDTO findOne(String orderId);

    /**
     * 根据用户id查询订单列表
     * @param buyerId
     * @param pageable
     * @return
     */
    Page<OrderDTO> findList(String buyerId, Pageable pageable);

    /**
     * 取消订单
     * @param orderDTO
     * @return
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     * @param orderDTO
     * @return
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     * @param orderDTO
     * @return
     */
    OrderDTO paid(OrderDTO orderDTO);
}
