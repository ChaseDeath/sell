package com.example.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 订单详情实体
 * @auther lfx
 * @date 2019/3/14 16:05
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单Id **/
    private String orderId;

    /** 商品Id **/
    private String productId;

    /** 商品名称 **/
    private String productName;

    /** 商品单价 **/
    private BigDecimal productPrice;

    /** 商品数量 **/
    private Integer productQuantity;

    /** 商品小图 **/
    private String productIcon;

    /** 创建时间 **/
    private Date createTime;

    /** 修改时间 **/
    private Date updateTime;

}
