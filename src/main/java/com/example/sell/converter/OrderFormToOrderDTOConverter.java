package com.example.sell.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.sell.dataobject.OrderDetail;
import com.example.sell.dto.OrderDTO;
import com.example.sell.enums.ResultEnum;
import com.example.sell.exception.SellException;
import com.example.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Description
 * @auther lfx
 * @date 2019/3/19 22:10
 */
@Slf4j
public class OrderFormToOrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        try {
            orderDTO.setOrderDetailList(JSON.parseObject(orderForm.getItems(),
                    new TypeReference<List<OrderDetail>>(){}));
        } catch (Exception e) {
            log.error("【对象转换】错误，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        return orderDTO;
    }

}
