package com.example.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表
 * @auther lfx
 * @date 2019/3/9 16:01
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /** 商品名字 **/
    private String productName;

    /** 单价 **/
    private BigDecimal productPrice;

    /** 库存 **/
    private Integer productStock;

    /** 描述 **/
    private String productDescription;

    /** 小图 **/
    private String productIcon;

    /** 状态 0正常1下架 **/
    private Integer productStatus;

    /** 类目编号 **/
    private Integer categoryType;

    /** 创建时间 **/
    private Date createTime;

    /** 修改时间 **/
    private Date updateTime;

}
