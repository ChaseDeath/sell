package com.example.sell.service;

import com.example.sell.dataobject.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<ProductCategory> findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);

    ProductCategory save(ProductCategory productCategory);
}
