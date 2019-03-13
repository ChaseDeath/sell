package com.example.sell.service.impl;

import com.example.sell.dataobject.ProductCategory;
import com.example.sell.repository.ProductCategoryRepository;
import com.example.sell.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() throws Exception {
        Optional<ProductCategory> productCategory = categoryService.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> list = categoryService.findAll();
        for (ProductCategory category : list){
            System.out.println(category.toString());
        }

    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1,3));
        for (ProductCategory category : list){
            System.out.println(category.toString());
        }
    }

    @Test
    public void save() throws Exception {
        ProductCategory category = new ProductCategory();
        category.setCategoryName("特价优惠");
        category.setCategoryType(5);
        categoryService.save(category);
    }

}