package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (OrderDetail)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail extends Model<OrderDetail> implements Serializable {
    private static final long serialVersionUID = 645009294995770340L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 订单主键
    */
    private Integer orderid;
    /**
    * 商品主键
    */
    private Integer productid;
    /**
    * 数量
    */
    private Integer quantity;
    /**
    * 消费
    */
    private Object cost;

}
