package com.example.sell.converter;

import com.example.sell.dataobject.OrderMaster;
import com.example.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Description OrderMaster转换成OrderDTO
 * @auther lfx
 * @date 2019/3/15 13:19
 */
public class OrderMasterToOrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
