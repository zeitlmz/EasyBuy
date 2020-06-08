package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (ProductCategory)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory extends Model<ProductCategory> implements Serializable {
    private static final long serialVersionUID = -75611454439474704L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 名称
    */
    private String name;
    /**
    * 父级目录id
    */
    private Integer parentid;
    /**
    * 级别(1:一级 2：二级 3：三级)
    */
    private Integer type;
    /**
    * 图标
    */
    private String iconclass;

}
