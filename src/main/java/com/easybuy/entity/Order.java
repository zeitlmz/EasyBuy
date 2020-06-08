package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends Model<Order> implements Serializable {
    private static final long serialVersionUID = 777405520823184268L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户主键
     */
    private Integer userid;

    private String loginname;
    /**
     * 用户地址
     */
    private String useraddress;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 总消费
     */
    private Object cost;
    /**
     * 订单号
     */
    private String serialnumber;

}
