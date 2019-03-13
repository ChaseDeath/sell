package com.example.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @auther lfx
 * @date 2019/3/9 10:30
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** 类目Id **/
    private Integer categoryId;

    /** 类目名字 **/
    private String categoryName;

    /** 类型编号 **/
    private Integer categoryType;

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "CategoryId: " + categoryId +
                " CategoryName: " + categoryName +
                " CategoryType: " + categoryType +
                " CreateTime: " + createTime +
                " UpdateTime: " + updateTime;
    }
}
