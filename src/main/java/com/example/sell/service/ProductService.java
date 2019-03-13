package com.example.sell.service;

import com.example.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * @Description 商品接口
 * @auther lfx
 * @date 2019/3/9 16:53
 */
public interface ProductService {

    Optional<ProductInfo> findById(String productId);

    /**
     * 查找所有上架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
