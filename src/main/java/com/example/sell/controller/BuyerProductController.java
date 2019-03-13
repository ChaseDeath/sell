package com.example.sell.controller;

import com.example.sell.VO.ProductInfoVO;
import com.example.sell.VO.ProductVO;
import com.example.sell.VO.ResultVO;
import com.example.sell.dataobject.ProductCategory;
import com.example.sell.dataobject.ProductInfo;
import com.example.sell.service.CategoryService;
import com.example.sell.service.ProductService;
import com.example.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 买家
 * @auther lfx
 * @date 2019/3/9 19:06
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResultVO list() {

        //1.根据所有商品查询出类目id
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryIds = productInfoList.stream()
                .map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryIds);
        //2.数据封装
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory  productCategory: productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo productInfo: productInfoList) {
                ProductInfoVO productInfoVO = new ProductInfoVO();

                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }



        return ResultVOUtil.success(productVOList);
    }
}
