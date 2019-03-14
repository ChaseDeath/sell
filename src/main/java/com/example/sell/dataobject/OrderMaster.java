package com.example.sell.dataobject;

import com.example.sell.enums.OrderStatusEnum;
import com.example.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 订单表实体
 * @auther lfx
 * @date 2019/3/14 15:39
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    /** 订单id **/
    @Id
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

}
