package com.easybuy.controller;

import com.easybuy.entity.OrderDetail;
import com.easybuy.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (OrderDetail)表控制层
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@RestController
@RequestMapping("orderDetail")
public class OrderDetailController {
    /**
     * 服务对象
     */
    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderDetail selectOne(Integer id) {
        return this.orderDetailService.queryById(id);
    }

}
