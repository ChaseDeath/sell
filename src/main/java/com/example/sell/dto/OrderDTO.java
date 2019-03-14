package com.example.sell.dto;

import com.example.sell.dataobject.OrderDetail;
import com.example.sell.enums.OrderStatusEnum;
import com.example.sell.enums.PayStatusEnum;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description 在各层传输的实体
 * @auther lfx
 * @date 2019/3/14 20:52
 */
@Data
public class OrderDTO {

    /** 订单id **/
    private String orderId;

    /** 买家姓名 **/
    private String buyerName;

    /** 买家手机号 **/
    private String buyerPhone;

    /** 买家地址 **/
    private String buyerAddress;

    /** 买家微信号 **/
    private String buyerOpenid;

    /** 订单总金额 **/
    private BigDecimal orderAmount;

    /** 订单状态，默认为0新下单 **/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态，默认为未0支付 **/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
