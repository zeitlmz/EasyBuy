package com.easybuy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-06-06 12:19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Model<User> implements Serializable {
    private static final long serialVersionUID = -84472659609669584L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 登录名
    */
    private String loginname;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 性别(1:男 0：女)
    */
    private Integer sex;
    /**
    * 身份证号
    */
    private String identitycode;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 手机
    */
    private String mobile;
    /**
    * 类型（1：后台 0:前台）
    */
    private Integer type;
}
