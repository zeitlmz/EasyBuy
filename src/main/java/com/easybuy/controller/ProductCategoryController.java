package com.easybuy.controller;

import com.easybuy.entity.ProductCategory;
import com.easybuy.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (ProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@RestController
@RequestMapping("productCategory")
public class ProductCategoryController {
    /**
     * 服务对象
     */
    @Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProductCategory selectOne(Integer id) {
        return this.productCategoryService.queryById(id);
    }

}
