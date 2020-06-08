package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Model<Product> implements Serializable {
    private static final long serialVersionUID = -10634016510345739L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 名称
    */
    private String name;
    /**
    * 描述
    */
    private String description;
    /**
    * 价格
    */
    private Object price;
    /**
    * 库存
    */
    private Integer stock;
    /**
    * 分类1
    */
    private Integer categorylevel1id;
    /**
    * 分类2
    */
    private Integer categorylevel2id;
    /**
    * 分类3
    */
    private Integer categorylevel3id;
    /**
    * 文件名称
    */
    private String filename;
    /**
    * 是否删除(1：删除 0：未删除)
    */
    private Integer isdelete;

}
