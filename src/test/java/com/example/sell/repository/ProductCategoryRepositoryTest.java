package com.example.sell.repository;

import com.example.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void saveTest() {
        ProductCategory category = new ProductCategory();
        category.setCategoryName("热销");
        category.setCategoryType(4);
        category.setUpdateTime(new Date());
        repository.save(category);
    }

    @Test
    public void findOneTest() {
        Optional<ProductCategory> category = repository.findById(1);
        System.out.println(category.toString());
    }

}