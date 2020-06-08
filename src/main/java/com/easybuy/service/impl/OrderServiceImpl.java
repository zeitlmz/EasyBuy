package com.easybuy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.easybuy.entity.Order;
import com.easybuy.dao.OrderDao;
import com.easybuy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Transactional
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao,Order> implements OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Order queryById(Integer id) {
        return getBaseMapper().queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Order> queryAllByLimit(int offset, int limit) {
        return getBaseMapper().queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean insert(Order order) {

        return getBaseMapper().insert(order)>0;
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean update(Order order) {

        return getBaseMapper().update(order)>0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Boolean deleteById(Integer id) {
        return getBaseMapper().deleteById(id) > 0;
    }
}
