package com.example.sell.repository;

import com.example.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description 订单详情Dao
 * @auther lfx
 * @date 2019/3/14 16:32
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
