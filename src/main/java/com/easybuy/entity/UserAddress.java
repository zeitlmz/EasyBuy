package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserAddress)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress extends Model<UserAddress> implements Serializable {
    private static final long serialVersionUID = -43045531154738309L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户主键
     */
    private Integer userid;
    /**
     * 地址
     */
    private String address;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 是否是默认地址（1:是 0否）
     */
    private Integer isdefault;
    /**
     * 备注
     */
    private String remark;

}
