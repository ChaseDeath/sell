package com.example.sell.service.impl;

import com.example.sell.dataobject.ProductCategory;
import com.example.sell.repository.ProductCategoryRepository;
import com.example.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @auther lfx
 * @date 2019/3/9 14:47
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public Optional<ProductCategory> findOne(Integer categoryId) {
        return repository.findById(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> list) {
        return repository.findByCategoryTypeIn(list);
    }


    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
