package com.easybuy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.easybuy.entity.ProductCategory;
import java.util.List;

/**
 * (ProductCategory)表服务接口
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductCategory queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProductCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    Boolean insert(ProductCategory productCategory);

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    Boolean update(ProductCategory productCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Boolean deleteById(Integer id);

}
