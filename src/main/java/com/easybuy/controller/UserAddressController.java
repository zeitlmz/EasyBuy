package com.easybuy.controller;

import com.easybuy.entity.UserAddress;
import com.easybuy.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (UserAddress)表控制层
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@RestController
@RequestMapping("userAddress")
public class UserAddressController {
    /**
     * 服务对象
     */
    @Autowired
    private UserAddressService userAddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserAddress selectOne(Integer id) {
        return this.userAddressService.queryById(id);
    }

}
