package com.example.sell.repository;

import com.example.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description TODO
 * @auther lfx
 * @date 2019/3/14 16:29
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    /**
     * 根据买家openid来查找订单
     * @param buyerOpenid
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
